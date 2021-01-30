// Generated from C:/Users/John Gabriel Legaspi/Documents/DLSU/4th Year/Term 1/CMPILER/CMPILER-MO1-Interpreter/src/Antlr\TripleJ.g4 by ANTLR 4.9
package Antlr;
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
	 * Visit a parse tree produced by {@link TripleJParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(TripleJParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(TripleJParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#genericSelection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericSelection(TripleJParser.GenericSelectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#genericAssocList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericAssocList(TripleJParser.GenericAssocListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#genericAssociation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericAssociation(TripleJParser.GenericAssociationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(TripleJParser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentExpressionList(TripleJParser.ArgumentExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(TripleJParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#unaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperator(TripleJParser.UnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression(TripleJParser.CastExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(TripleJParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(TripleJParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression(TripleJParser.ShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(TripleJParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(TripleJParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(TripleJParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusiveOrExpression(TripleJParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusiveOrExpression(TripleJParser.InclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpression(TripleJParser.LogicalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpression(TripleJParser.LogicalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(TripleJParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(TripleJParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(TripleJParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(TripleJParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(TripleJParser.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(TripleJParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationSpecifiers(TripleJParser.DeclarationSpecifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#declarationSpecifiers2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationSpecifiers2(TripleJParser.DeclarationSpecifiers2Context ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationSpecifier(TripleJParser.DeclarationSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclaratorList(TripleJParser.InitDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#initDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclarator(TripleJParser.InitDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageClassSpecifier(TripleJParser.StorageClassSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSpecifier(TripleJParser.TypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructOrUnionSpecifier(TripleJParser.StructOrUnionSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#structOrUnion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructOrUnion(TripleJParser.StructOrUnionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#structDeclarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclarationList(TripleJParser.StructDeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#structDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclaration(TripleJParser.StructDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecifierQualifierList(TripleJParser.SpecifierQualifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#structDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclaratorList(TripleJParser.StructDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#structDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclarator(TripleJParser.StructDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#enumSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumSpecifier(TripleJParser.EnumSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#enumeratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumeratorList(TripleJParser.EnumeratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#enumerator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerator(TripleJParser.EnumeratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#enumerationConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerationConstant(TripleJParser.EnumerationConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#atomicTypeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomicTypeSpecifier(TripleJParser.AtomicTypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#typeQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeQualifier(TripleJParser.TypeQualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#functionSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionSpecifier(TripleJParser.FunctionSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#alignmentSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlignmentSpecifier(TripleJParser.AlignmentSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarator(TripleJParser.DeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#directDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectDeclarator(TripleJParser.DirectDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#gccDeclaratorExtension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGccDeclaratorExtension(TripleJParser.GccDeclaratorExtensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#gccAttributeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGccAttributeSpecifier(TripleJParser.GccAttributeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#gccAttributeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGccAttributeList(TripleJParser.GccAttributeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#gccAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGccAttribute(TripleJParser.GccAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#nestedParenthesesBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedParenthesesBlock(TripleJParser.NestedParenthesesBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#pointer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointer(TripleJParser.PointerContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#typeQualifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeQualifierList(TripleJParser.TypeQualifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#parameterTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterTypeList(TripleJParser.ParameterTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(TripleJParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclaration(TripleJParser.ParameterDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(TripleJParser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(TripleJParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstractDeclarator(TripleJParser.AbstractDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectAbstractDeclarator(TripleJParser.DirectAbstractDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#typedefName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedefName(TripleJParser.TypedefNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer(TripleJParser.InitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#initializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializerList(TripleJParser.InitializerListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#designation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesignation(TripleJParser.DesignationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#designatorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesignatorList(TripleJParser.DesignatorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#designator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesignator(TripleJParser.DesignatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticAssertDeclaration(TripleJParser.StaticAssertDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(TripleJParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(TripleJParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#labeledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatement(TripleJParser.LabeledStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(TripleJParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#blockItemList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockItemList(TripleJParser.BlockItemListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#blockItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockItem(TripleJParser.BlockItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(TripleJParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#selectionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectionStatement(TripleJParser.SelectionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterationStatement(TripleJParser.IterationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#whileExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileExpression(TripleJParser.WhileExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#forCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForCondition(TripleJParser.ForConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#forDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForDeclaration(TripleJParser.ForDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#forExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForExpression(TripleJParser.ForExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#jumpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJumpStatement(TripleJParser.JumpStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(TripleJParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#translationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranslationUnit(TripleJParser.TranslationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#externalDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternalDeclaration(TripleJParser.ExternalDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(TripleJParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TripleJParser#declarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationList(TripleJParser.DeclarationListContext ctx);
}