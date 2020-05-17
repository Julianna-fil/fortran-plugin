package org.jetbrains.fortran.lang.preprocessor

import org.jetbrains.fortran.lang.lexer.FortranLexer
import org.jetbrains.fortran.lang.psi.FortranTokenSets
import org.jetbrains.fortran.lang.psi.FortranTokenType

class FortranMacro(val name: String, val value: String) {
    companion object {
        fun parseFromDirectiveContent(content: CharSequence): FortranMacro? {
            val lexer = FortranLexer(false)
            lexer.start(content)
            while (FortranTokenSets.WHITE_SPACES.contains(lexer.tokenType)) {
                lexer.advance()
            }
            if (lexer.tokenType == FortranTokenType.WORD) {
                val macro = lexer.tokenText
                lexer.advance()
                while (FortranTokenSets.WHITE_SPACES.contains(lexer.tokenType)) {
                    lexer.advance()
                }
                var marco_value = ""
                while (lexer.tokenType != FortranTokenType.LINE_CONTINUE) {
                    marco_value += lexer.tokenText
                    lexer.advance()
                    if (lexer.tokenType == null) {
                        break;
                    }

                }
                return FortranMacro(macro, marco_value)
            }
            return null
        }
    }
}