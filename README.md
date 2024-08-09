# Compiler For FunctionCraft Language

## Overview

This project is a compiler implementation for a hypothetical programming language which is called FunctionCraft. It's divided into three main parts: **Lexical Analyzer**, **Syntax Analyzer**, and **Type Checking**. 
The project uses the ANTLR4 tool for the initial phases of compilation and follows a structured approach to parse and validate the source code.

### 1. Lexical Analyzer
The Lexical Analyzer is responsible for reading the input source code and converting it into tokens. These tokens are symbolic representations of the smallest units of meaning (e.g., keywords, operators, identifiers).
The tokens are then passed on to the Syntax Analyzer.

#### Key Features:
- **Token Generation:** ANTLR4 is used to define the lexical structure and produce tokens.
- **Error Handling:** Handles invalid tokens and provides meaningful error messages.

### 2. Syntax Analyzer
The Syntax Analyzer, also known as the parser, takes the tokens produced by the Lexical Analyzer and builds a parse tree. The parse tree represents the syntactical structure of the source code according to the language grammar.

#### Key Features:
- **Grammar Parsing:** Utilizes ANTLR4 to define the grammar rules.
- **Parse Tree Generation:** Constructs a hierarchical representation of the code based on the defined grammar.
- **Error Recovery:** Implements strategies to continue parsing in the event of errors to provide comprehensive error reports.

### 3. Type Checking
The Type Checker performs semantic analysis on the parse tree. It verifies that the types of variables and expressions conform to the language's type system rules. Type checking ensures that operations are applied to compatible types
and detects errors such as type mismatches.

#### Key Features:
- **Type Inference:** Automatically infers types in expressions and variables.
- **Type Error Detection:** Detects and reports type errors, such as incompatible operands or invalid function arguments.
- **Flow Analysis:** Analyzes the control flow to ensure type safety across different paths in the code.


## Features and Functions

### Parsing and Syntax
- **Function Definitions:** 
  - `FuncDec: "function name"` defines a new function.
  - `RETURN` statement for returning values from functions.
- **Conditional Statements:** 
  - `IF`, `ELSE IF`, and `ELSE` for decision-making constructs.
- **Looping Constructs:** 
  - `LOOP DO` and `FOR` loops for iteration.
- **Pattern Matching:** 
  - `PatternDec: "pattern name"` for defining and using patterns.
  
### Built-In Functions
- **PUTS**: Output a string.
- **LEN**: Get the length of a list or string.
- **PUSH**: Add an element to a list.
- **MATCH**: Perform pattern matching.
- **CHOP**: Remove the last element of a string or list.
- **CHOMP**: Remove the last character of a string if it is a newline.

### Type Checking and Errors
- **Type Inference:** Automatic detection of variable and expression types.
- **Error Reporting:** Detailed reporting of type mismatches and other semantic errors.
- **Supported Data Structures:** Supports lists, multi-dimensional arrays, and lambda functions.

### Semantic Analysis
- **Flow Analysis:** Ensures type safety through different code paths.
- **Type Variable:** Manages and infers types of variables within the code.

