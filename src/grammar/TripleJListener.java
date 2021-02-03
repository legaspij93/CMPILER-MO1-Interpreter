// Generated from C:/Users/John Gabriel Legaspi/Documents/DLSU/4th Year/Term 1/CMPILER/CMPILER-MO1-Interpreter/src/grammar\TripleJ.g4 by ANTLR 4.9
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TripleJParser}.
 */
public interface TripleJListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TripleJParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(TripleJParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(TripleJParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(TripleJParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(TripleJParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(TripleJParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(TripleJParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(TripleJParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(TripleJParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(TripleJParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(TripleJParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(TripleJParser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(TripleJParser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(TripleJParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(TripleJParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstants(TripleJParser.EnumConstantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstants(TripleJParser.EnumConstantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(TripleJParser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(TripleJParser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(TripleJParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(TripleJParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(TripleJParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(TripleJParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(TripleJParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(TripleJParser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(TripleJParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(TripleJParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(TripleJParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(TripleJParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(TripleJParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(TripleJParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(TripleJParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(TripleJParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration(TripleJParser.MemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration(TripleJParser.MemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#mainDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMainDeclaration(TripleJParser.MainDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#mainDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMainDeclaration(TripleJParser.MainDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(TripleJParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(TripleJParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericMethodDeclaration(TripleJParser.GenericMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericMethodDeclaration(TripleJParser.GenericMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(TripleJParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(TripleJParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(TripleJParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(TripleJParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBodyDeclaration(TripleJParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBodyDeclaration(TripleJParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(TripleJParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(TripleJParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstDeclaration(TripleJParser.ConstDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstDeclaration(TripleJParser.ConstDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclarator(TripleJParser.ConstantDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclarator(TripleJParser.ConstantDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(TripleJParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(TripleJParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericInterfaceMethodDeclaration(TripleJParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericInterfaceMethodDeclaration(TripleJParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(TripleJParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(TripleJParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(TripleJParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(TripleJParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(TripleJParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(TripleJParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(TripleJParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(TripleJParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(TripleJParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(TripleJParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantName(TripleJParser.EnumConstantNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantName(TripleJParser.EnumConstantNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#typeType}.
	 * @param ctx the parse tree
	 */
	void enterTypeType(TripleJParser.TypeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#typeType}.
	 * @param ctx the parse tree
	 */
	void exitTypeType(TripleJParser.TypeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(TripleJParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(TripleJParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(TripleJParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(TripleJParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(TripleJParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(TripleJParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(TripleJParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(TripleJParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameList(TripleJParser.QualifiedNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameList(TripleJParser.QualifiedNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(TripleJParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(TripleJParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(TripleJParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(TripleJParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(TripleJParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(TripleJParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(TripleJParser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(TripleJParser.LastFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(TripleJParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(TripleJParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void enterConstructorBody(TripleJParser.ConstructorBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void exitConstructorBody(TripleJParser.ConstructorBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(TripleJParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(TripleJParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(TripleJParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(TripleJParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(TripleJParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(TripleJParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#annotationName}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationName(TripleJParser.AnnotationNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#annotationName}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationName(TripleJParser.AnnotationNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairs(TripleJParser.ElementValuePairsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairs(TripleJParser.ElementValuePairsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(TripleJParser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(TripleJParser.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(TripleJParser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(TripleJParser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(TripleJParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(TripleJParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeDeclaration(TripleJParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeDeclaration(TripleJParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeBody(TripleJParser.AnnotationTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeBody(TripleJParser.AnnotationTypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementDeclaration(TripleJParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementDeclaration(TripleJParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementRest(TripleJParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementRest(TripleJParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodOrConstantRest(TripleJParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodOrConstantRest(TripleJParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodRest(TripleJParser.AnnotationMethodRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodRest(TripleJParser.AnnotationMethodRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationConstantRest(TripleJParser.AnnotationConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationConstantRest(TripleJParser.AnnotationConstantRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(TripleJParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(TripleJParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(TripleJParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(TripleJParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(TripleJParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(TripleJParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(TripleJParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(TripleJParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(TripleJParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(TripleJParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(TripleJParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(TripleJParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#scanStatement}.
	 * @param ctx the parse tree
	 */
	void enterScanStatement(TripleJParser.ScanStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#scanStatement}.
	 * @param ctx the parse tree
	 */
	void exitScanStatement(TripleJParser.ScanStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(TripleJParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(TripleJParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(TripleJParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(TripleJParser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#catchType}.
	 * @param ctx the parse tree
	 */
	void enterCatchType(TripleJParser.CatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#catchType}.
	 * @param ctx the parse tree
	 */
	void exitCatchType(TripleJParser.CatchTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void enterFinallyBlock(TripleJParser.FinallyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void exitFinallyBlock(TripleJParser.FinallyBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(TripleJParser.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(TripleJParser.ResourceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#resources}.
	 * @param ctx the parse tree
	 */
	void enterResources(TripleJParser.ResourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#resources}.
	 * @param ctx the parse tree
	 */
	void exitResources(TripleJParser.ResourcesContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(TripleJParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(TripleJParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(TripleJParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(TripleJParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(TripleJParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(TripleJParser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(TripleJParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(TripleJParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(TripleJParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(TripleJParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForControl(TripleJParser.EnhancedForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForControl(TripleJParser.EnhancedForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(TripleJParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(TripleJParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(TripleJParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(TripleJParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(TripleJParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(TripleJParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(TripleJParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(TripleJParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(TripleJParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(TripleJParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(TripleJParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(TripleJParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(TripleJParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(TripleJParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#creator}.
	 * @param ctx the parse tree
	 */
	void enterCreator(TripleJParser.CreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#creator}.
	 * @param ctx the parse tree
	 */
	void exitCreator(TripleJParser.CreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#createdName}.
	 * @param ctx the parse tree
	 */
	void enterCreatedName(TripleJParser.CreatedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#createdName}.
	 * @param ctx the parse tree
	 */
	void exitCreatedName(TripleJParser.CreatedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreatorRest(TripleJParser.ArrayCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreatorRest(TripleJParser.ArrayCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterClassCreatorRest(TripleJParser.ClassCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitClassCreatorRest(TripleJParser.ClassCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArguments(TripleJParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArguments(TripleJParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(TripleJParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(TripleJParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArgumentsOrDiamond(TripleJParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArgumentsOrDiamond(TripleJParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocationSuffix(TripleJParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocationSuffix(TripleJParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(TripleJParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(TripleJParser.ArgumentsContext ctx);
}