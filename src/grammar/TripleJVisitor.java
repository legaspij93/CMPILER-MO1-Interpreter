// Generated from C:/Users/John Gabriel Legaspi/Documents/DLSU/4th Year/Term 1/CMPILER/CMPILER-MO1-Interpreter/src/grammar\TripleJ.g4 by ANTLR 4.9
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TripleJParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TripleJVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TripleJParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(TripleJParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(TripleJParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#variableModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifier(TripleJParser.VariableModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(TripleJParser.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(TripleJParser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#typeBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBound(TripleJParser.TypeBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(TripleJParser.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#enumConstants}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstants(TripleJParser.EnumConstantsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#enumConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstant(TripleJParser.EnumConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBodyDeclarations(TripleJParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(TripleJParser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(TripleJParser.TypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(TripleJParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(TripleJParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(TripleJParser.InterfaceBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(TripleJParser.ClassBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclaration(TripleJParser.MemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#mainDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainDeclaration(TripleJParser.MainDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(TripleJParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericMethodDeclaration(TripleJParser.GenericMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(TripleJParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(TripleJParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBodyDeclaration(TripleJParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberDeclaration(TripleJParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#constDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDeclaration(TripleJParser.ConstDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#constantDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclarator(TripleJParser.ConstantDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodDeclaration(TripleJParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericInterfaceMethodDeclaration(TripleJParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#variableDeclarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarators(TripleJParser.VariableDeclaratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(TripleJParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(TripleJParser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(TripleJParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(TripleJParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#enumConstantName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantName(TripleJParser.EnumConstantNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#typeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeType(TripleJParser.TypeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceType(TripleJParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(TripleJParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(TripleJParser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument(TripleJParser.TypeArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedNameList(TripleJParser.QualifiedNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(TripleJParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(TripleJParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(TripleJParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFormalParameter(TripleJParser.LastFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(TripleJParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#constructorBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorBody(TripleJParser.ConstructorBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(TripleJParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(TripleJParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(TripleJParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#annotationName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationName(TripleJParser.AnnotationNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#elementValuePairs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePairs(TripleJParser.ElementValuePairsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#elementValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePair(TripleJParser.ElementValuePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValue(TripleJParser.ElementValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueArrayInitializer(TripleJParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeDeclaration(TripleJParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeBody(TripleJParser.AnnotationTypeBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementDeclaration(TripleJParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementRest(TripleJParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationMethodOrConstantRest(TripleJParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationMethodRest(TripleJParser.AnnotationMethodRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationConstantRest(TripleJParser.AnnotationConstantRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(TripleJParser.DefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(TripleJParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(TripleJParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclarationStatement(TripleJParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(TripleJParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(TripleJParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#scanStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScanStatement(TripleJParser.ScanStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(TripleJParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#catchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchClause(TripleJParser.CatchClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#catchType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchType(TripleJParser.CatchTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#finallyBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinallyBlock(TripleJParser.FinallyBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#resourceSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceSpecification(TripleJParser.ResourceSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#resources}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResources(TripleJParser.ResourcesContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(TripleJParser.ResourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatementGroup(TripleJParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel(TripleJParser.SwitchLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#forControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControl(TripleJParser.ForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(TripleJParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#enhancedForControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForControl(TripleJParser.EnhancedForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdate(TripleJParser.ForUpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(TripleJParser.ParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(TripleJParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#statementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpression(TripleJParser.StatementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(TripleJParser.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(TripleJParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(TripleJParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#creator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreator(TripleJParser.CreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#createdName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatedName(TripleJParser.CreatedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreatorRest(TripleJParser.ArrayCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#classCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassCreatorRest(TripleJParser.ClassCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonWildcardTypeArguments(TripleJParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentsOrDiamond(TripleJParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonWildcardTypeArgumentsOrDiamond(TripleJParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitGenericInvocationSuffix(TripleJParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(TripleJParser.ArgumentsContext ctx);
}