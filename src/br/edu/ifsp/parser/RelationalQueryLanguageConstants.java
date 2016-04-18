/* Generated By:JavaCC: Do not edit this line. RelationalQueryLanguageConstants.java */
package br.edu.ifsp.parser;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface RelationalQueryLanguageConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int QUOTE = 5;
  /** RegularExpression Id. */
  int DOUBLE_QUOTE = 6;
  /** RegularExpression Id. */
  int PERCENT = 7;
  /** RegularExpression Id. */
  int AMPERSAND = 8;
  /** RegularExpression Id. */
  int LEFT_PARENTHESIS = 9;
  /** RegularExpression Id. */
  int RIGHT_PARENTHESIS = 10;
  /** RegularExpression Id. */
  int ASTERISK = 11;
  /** RegularExpression Id. */
  int PLUS_SIGN = 12;
  /** RegularExpression Id. */
  int COMMA = 13;
  /** RegularExpression Id. */
  int MINUS_SIGN = 14;
  /** RegularExpression Id. */
  int PERIOD = 15;
  /** RegularExpression Id. */
  int SOLIDUS = 16;
  /** RegularExpression Id. */
  int COLON = 17;
  /** RegularExpression Id. */
  int SEMICOLON = 18;
  /** RegularExpression Id. */
  int LESS_THAN = 19;
  /** RegularExpression Id. */
  int EQUALS = 20;
  /** RegularExpression Id. */
  int NOT_EQUALS = 21;
  /** RegularExpression Id. */
  int GREATER_THAN = 22;
  /** RegularExpression Id. */
  int GREATER_THAN_OR_EQUALS = 23;
  /** RegularExpression Id. */
  int LESS_THAN_OR_EQUALS = 24;
  /** RegularExpression Id. */
  int QUESTION_MARK = 25;
  /** RegularExpression Id. */
  int UNDERSCORE = 26;
  /** RegularExpression Id. */
  int VERTICAL_BAR = 27;
  /** RegularExpression Id. */
  int LEFT_BRACKET = 28;
  /** RegularExpression Id. */
  int RIGHT_BRACKET = 29;
  /** RegularExpression Id. */
  int LEFT_KEY = 30;
  /** RegularExpression Id. */
  int RIGHT_KEY = 31;
  /** RegularExpression Id. */
  int INSTANCEOF = 32;
  /** RegularExpression Id. */
  int IF = 33;
  /** RegularExpression Id. */
  int POWER = 34;
  /** RegularExpression Id. */
  int PROJECT_TOKEN = 35;
  /** RegularExpression Id. */
  int SELECT_TOKEN = 36;
  /** RegularExpression Id. */
  int RENAME_TOKEN = 37;
  /** RegularExpression Id. */
  int EXTEND_TOKEN = 38;
  /** RegularExpression Id. */
  int CROSS_TOKEN = 39;
  /** RegularExpression Id. */
  int NATURAL_JOIN_TOKEN = 40;
  /** RegularExpression Id. */
  int COUNT = 41;
  /** RegularExpression Id. */
  int SUM = 42;
  /** RegularExpression Id. */
  int AVG = 43;
  /** RegularExpression Id. */
  int MAX = 44;
  /** RegularExpression Id. */
  int MIN = 45;
  /** RegularExpression Id. */
  int AND = 46;
  /** RegularExpression Id. */
  int OR = 47;
  /** RegularExpression Id. */
  int XOR = 48;
  /** RegularExpression Id. */
  int NOT = 49;
  /** RegularExpression Id. */
  int VARCHAR_TYPE = 50;
  /** RegularExpression Id. */
  int CHAR_TYPE = 51;
  /** RegularExpression Id. */
  int INTEGER_TYPE = 52;
  /** RegularExpression Id. */
  int DOUBLE_TYPE = 53;
  /** RegularExpression Id. */
  int FLOAT_TYPE = 54;
  /** RegularExpression Id. */
  int BLOB_TYPE = 55;
  /** RegularExpression Id. */
  int GEOMETRIC_TYPE = 56;
  /** RegularExpression Id. */
  int RELATION_TYPE = 57;
  /** RegularExpression Id. */
  int BOOLEAN_TYPE = 58;
  /** RegularExpression Id. */
  int INTEGER = 59;
  /** RegularExpression Id. */
  int DECIMAL = 60;
  /** RegularExpression Id. */
  int HEX = 61;
  /** RegularExpression Id. */
  int OCT = 62;
  /** RegularExpression Id. */
  int BIN = 63;
  /** RegularExpression Id. */
  int STRING = 64;
  /** RegularExpression Id. */
  int TRUE = 65;
  /** RegularExpression Id. */
  int FALSE = 66;
  /** RegularExpression Id. */
  int IDENTIFIER = 67;
  /** RegularExpression Id. */
  int LETTER = 68;
  /** RegularExpression Id. */
  int DIGIT = 69;
  /** RegularExpression Id. */
  int INVALID_LEXICAL = 79;
  /** RegularExpression Id. */
  int INVALID_CONST = 80;

  /** Lexical state. */
  int DEFAULT = 0;
  /** Lexical state. */
  int ENDLINE_COMMENT = 1;
  /** Lexical state. */
  int MULTILINE_COMMENT = 2;
  /** Lexical state. */
  int DOCUMENTATION_COMMENT = 3;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\n\"",
    "\"\\r\"",
    "\"\\r\\n\"",
    "\"\\\'\"",
    "\"\\\"\"",
    "\"%\"",
    "\"&\"",
    "\"(\"",
    "\")\"",
    "\"*\"",
    "\"+\"",
    "\",\"",
    "\"-\"",
    "\".\"",
    "\"/\"",
    "\":\"",
    "\";\"",
    "\"<\"",
    "\"=\"",
    "<NOT_EQUALS>",
    "\">\"",
    "\">=\"",
    "\"<=\"",
    "\"?\"",
    "\"_\"",
    "\"|\"",
    "\"[\"",
    "\"]\"",
    "\"{\"",
    "\"}\"",
    "\"instanceof\"",
    "\"->\"",
    "\"**\"",
    "\"\\u00a2\"",
    "\"\\u00a3\"",
    "\"\\u00a7\"",
    "<EXTEND_TOKEN>",
    "\"x\"",
    "\"[]\"",
    "\"#\"",
    "\"$\"",
    "\"@\"",
    "<MAX>",
    "<MIN>",
    "\"^\"",
    "\"v\"",
    "\"_v_\"",
    "\"\\u00ac\"",
    "<VARCHAR_TYPE>",
    "<CHAR_TYPE>",
    "<INTEGER_TYPE>",
    "<DOUBLE_TYPE>",
    "<FLOAT_TYPE>",
    "<BLOB_TYPE>",
    "<GEOMETRIC_TYPE>",
    "<RELATION_TYPE>",
    "\"BOOLEAN\"",
    "<INTEGER>",
    "<DECIMAL>",
    "<HEX>",
    "<OCT>",
    "<BIN>",
    "<STRING>",
    "\"TRUE\"",
    "\"FALSE\"",
    "<IDENTIFIER>",
    "<LETTER>",
    "<DIGIT>",
    "\"//\"",
    "\"\\n\"",
    "<token of kind 72>",
    "\"/*\"",
    "\"*/\"",
    "<token of kind 75>",
    "\"/**\"",
    "\"*/\"",
    "<token of kind 78>",
    "<INVALID_LEXICAL>",
    "<INVALID_CONST>",
  };

}
