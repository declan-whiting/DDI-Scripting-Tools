exception TDDIAbstractEpsilonScriptExecutionException{
    1: TDDIEpsilonScriptExecutionExceptionUnion UsedException,
    2: TDDIEpsilonScriptExecutionExceptionUnionType UsedExceptionType
}

union TDDIEpsilonScriptExecutionExceptionUnion{
    1: TDDIValidationFailedException& ValidationFailedException,
    2: TDDIEpsilonScriptExecutionException& EpsilonScriptExecutionException
}

struct TDDIEpsilonScriptExecutionException{
    1: string Message = ""
}

struct TDDIValidationFailedException{
    1: TDDIValidationResult ValidationResult
}

struct TDDIValidationResult{
    1: bool ValidationViolationOccurred = false,
    2: list<TDDIValidationViolationMessage> ValidationViolationMessages = []
}

struct TDDIValidationViolationMessage{
    1: string Context = "",
    2: string Message = ""
}

struct TDDIServiceConfig{
	1: string DDIFilePath = "",
	2: list<TDDIEpsilonScriptExecutionConfig> EpsilonScriptExecutionConfig = []
}

struct TDDIEpsilonScriptExecutionConfig{
	1: string ScriptFilePath = "",
	2: string ScriptContent = "",
	3: bool ExecuteWithScriptFile,
	4: TDDIEpsilonLanguage EpsilonLanguage,
    5: list<TDDIEpsilonScriptModelConfig> ModelConfigs = [],
    6: list<TDDIEpsilonParameter> ExportParameters = [],
    7: list<TDDIEpsilonParameter> ImportParameters = [],
    8: string VariableNameOfReturnValue = ""
}

struct TDDIEpsilonScriptModelConfig{
    1: string ModelUri = "",
    2: string ModelName = "",
    3: string Alias = "",
    4: bool ReadOnLoad, // rename 
    5: bool StoreOnDisposal // rename
}

struct TDDIEpsilonParameter{
    1: string Name = "",
    2: string Alias = ""
}

struct TDDIExternalServiceParameter{
    1: string Name = "",
    2: string Value
}
