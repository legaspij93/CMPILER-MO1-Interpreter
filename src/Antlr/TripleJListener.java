// Generated from C:/Users/John Gabriel Legaspi/Documents/DLSU/4th Year/Term 1/CMPILER/CMPILER-MO1-Interpreter/src/Antlr\TripleJ.g4 by ANTLR 4.9
package Antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TripleJParser}.
 */
public interface TripleJListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TripleJParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(TripleJParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(TripleJParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(TripleJParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(TripleJParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#genericSelection}.
	 * @param ctx the parse tree
	 */
	void enterGenericSelection(TripleJParser.GenericSelectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#genericSelection}.
	 * @param ctx the parse tree
	 */
	void exitGenericSelection(TripleJParser.GenericSelectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#genericAssocList}.
	 * @param ctx the parse tree
	 */
	void enterGenericAssocList(TripleJParser.GenericAssocListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#genericAssocList}.
	 * @param ctx the parse tree
	 */
	void exitGenericAssocList(TripleJParser.GenericAssocListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#genericAssociation}.
	 * @param ctx the parse tree
	 */
	void enterGenericAssociation(TripleJParser.GenericAssociationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#genericAssociation}.
	 * @param ctx the parse tree
	 */
	void exitGenericAssociation(TripleJParser.GenericAssociationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(TripleJParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(TripleJParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentExpressionList(TripleJParser.ArgumentExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentExpressionList(TripleJParser.ArgumentExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(TripleJParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(TripleJParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(TripleJParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(TripleJParser.UnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(TripleJParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(TripleJParser.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(TripleJParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(TripleJParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(TripleJParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(TripleJParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(TripleJParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(TripleJParser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(TripleJParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(TripleJParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(TripleJParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(TripleJParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(TripleJParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(TripleJParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(TripleJParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(TripleJParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(TripleJParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(TripleJParser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(TripleJParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(TripleJParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(TripleJParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(TripleJParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(TripleJParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(TripleJParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(TripleJParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(TripleJParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(TripleJParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(TripleJParser.AssignmentOperatorContext ctx);
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
	 * Enter a parse tree produced by {@link TripleJParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(TripleJParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(TripleJParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifiers(TripleJParser.DeclarationSpecifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifiers(TripleJParser.DeclarationSpecifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#declarationSpecifiers2}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifiers2(TripleJParser.DeclarationSpecifiers2Context ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#declarationSpecifiers2}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifiers2(TripleJParser.DeclarationSpecifiers2Context ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifier(TripleJParser.DeclarationSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifier(TripleJParser.DeclarationSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclaratorList(TripleJParser.InitDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclaratorList(TripleJParser.InitDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclarator(TripleJParser.InitDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclarator(TripleJParser.InitDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterStorageClassSpecifier(TripleJParser.StorageClassSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitStorageClassSpecifier(TripleJParser.StorageClassSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecifier(TripleJParser.TypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecifier(TripleJParser.TypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterStructOrUnionSpecifier(TripleJParser.StructOrUnionSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitStructOrUnionSpecifier(TripleJParser.StructOrUnionSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#structOrUnion}.
	 * @param ctx the parse tree
	 */
	void enterStructOrUnion(TripleJParser.StructOrUnionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#structOrUnion}.
	 * @param ctx the parse tree
	 */
	void exitStructOrUnion(TripleJParser.StructOrUnionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#structDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclarationList(TripleJParser.StructDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#structDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclarationList(TripleJParser.StructDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaration(TripleJParser.StructDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaration(TripleJParser.StructDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 */
	void enterSpecifierQualifierList(TripleJParser.SpecifierQualifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 */
	void exitSpecifierQualifierList(TripleJParser.SpecifierQualifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#structDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaratorList(TripleJParser.StructDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#structDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaratorList(TripleJParser.StructDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#structDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclarator(TripleJParser.StructDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#structDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclarator(TripleJParser.StructDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#enumSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterEnumSpecifier(TripleJParser.EnumSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#enumSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitEnumSpecifier(TripleJParser.EnumSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#enumeratorList}.
	 * @param ctx the parse tree
	 */
	void enterEnumeratorList(TripleJParser.EnumeratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#enumeratorList}.
	 * @param ctx the parse tree
	 */
	void exitEnumeratorList(TripleJParser.EnumeratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void enterEnumerator(TripleJParser.EnumeratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void exitEnumerator(TripleJParser.EnumeratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#enumerationConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumerationConstant(TripleJParser.EnumerationConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#enumerationConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumerationConstant(TripleJParser.EnumerationConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#atomicTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterAtomicTypeSpecifier(TripleJParser.AtomicTypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#atomicTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitAtomicTypeSpecifier(TripleJParser.AtomicTypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#typeQualifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeQualifier(TripleJParser.TypeQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#typeQualifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeQualifier(TripleJParser.TypeQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#functionSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterFunctionSpecifier(TripleJParser.FunctionSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#functionSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitFunctionSpecifier(TripleJParser.FunctionSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#alignmentSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterAlignmentSpecifier(TripleJParser.AlignmentSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#alignmentSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitAlignmentSpecifier(TripleJParser.AlignmentSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterDeclarator(TripleJParser.DeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitDeclarator(TripleJParser.DeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterDirectDeclarator(TripleJParser.DirectDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitDirectDeclarator(TripleJParser.DirectDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#gccDeclaratorExtension}.
	 * @param ctx the parse tree
	 */
	void enterGccDeclaratorExtension(TripleJParser.GccDeclaratorExtensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#gccDeclaratorExtension}.
	 * @param ctx the parse tree
	 */
	void exitGccDeclaratorExtension(TripleJParser.GccDeclaratorExtensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#gccAttributeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterGccAttributeSpecifier(TripleJParser.GccAttributeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#gccAttributeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitGccAttributeSpecifier(TripleJParser.GccAttributeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#gccAttributeList}.
	 * @param ctx the parse tree
	 */
	void enterGccAttributeList(TripleJParser.GccAttributeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#gccAttributeList}.
	 * @param ctx the parse tree
	 */
	void exitGccAttributeList(TripleJParser.GccAttributeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#gccAttribute}.
	 * @param ctx the parse tree
	 */
	void enterGccAttribute(TripleJParser.GccAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#gccAttribute}.
	 * @param ctx the parse tree
	 */
	void exitGccAttribute(TripleJParser.GccAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#nestedParenthesesBlock}.
	 * @param ctx the parse tree
	 */
	void enterNestedParenthesesBlock(TripleJParser.NestedParenthesesBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#nestedParenthesesBlock}.
	 * @param ctx the parse tree
	 */
	void exitNestedParenthesesBlock(TripleJParser.NestedParenthesesBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#pointer}.
	 * @param ctx the parse tree
	 */
	void enterPointer(TripleJParser.PointerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#pointer}.
	 * @param ctx the parse tree
	 */
	void exitPointer(TripleJParser.PointerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#typeQualifierList}.
	 * @param ctx the parse tree
	 */
	void enterTypeQualifierList(TripleJParser.TypeQualifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#typeQualifierList}.
	 * @param ctx the parse tree
	 */
	void exitTypeQualifierList(TripleJParser.TypeQualifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#parameterTypeList}.
	 * @param ctx the parse tree
	 */
	void enterParameterTypeList(TripleJParser.ParameterTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#parameterTypeList}.
	 * @param ctx the parse tree
	 */
	void exitParameterTypeList(TripleJParser.ParameterTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(TripleJParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(TripleJParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclaration(TripleJParser.ParameterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclaration(TripleJParser.ParameterDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(TripleJParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(TripleJParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(TripleJParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(TripleJParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterAbstractDeclarator(TripleJParser.AbstractDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitAbstractDeclarator(TripleJParser.AbstractDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterDirectAbstractDeclarator(TripleJParser.DirectAbstractDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitDirectAbstractDeclarator(TripleJParser.DirectAbstractDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#typedefName}.
	 * @param ctx the parse tree
	 */
	void enterTypedefName(TripleJParser.TypedefNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#typedefName}.
	 * @param ctx the parse tree
	 */
	void exitTypedefName(TripleJParser.TypedefNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(TripleJParser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(TripleJParser.InitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#initializerList}.
	 * @param ctx the parse tree
	 */
	void enterInitializerList(TripleJParser.InitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#initializerList}.
	 * @param ctx the parse tree
	 */
	void exitInitializerList(TripleJParser.InitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#designation}.
	 * @param ctx the parse tree
	 */
	void enterDesignation(TripleJParser.DesignationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#designation}.
	 * @param ctx the parse tree
	 */
	void exitDesignation(TripleJParser.DesignationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#designatorList}.
	 * @param ctx the parse tree
	 */
	void enterDesignatorList(TripleJParser.DesignatorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#designatorList}.
	 * @param ctx the parse tree
	 */
	void exitDesignatorList(TripleJParser.DesignatorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#designator}.
	 * @param ctx the parse tree
	 */
	void enterDesignator(TripleJParser.DesignatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#designator}.
	 * @param ctx the parse tree
	 */
	void exitDesignator(TripleJParser.DesignatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStaticAssertDeclaration(TripleJParser.StaticAssertDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStaticAssertDeclaration(TripleJParser.StaticAssertDeclarationContext ctx);
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
	 * Enter a parse tree produced by {@link TripleJParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(TripleJParser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(TripleJParser.LabeledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(TripleJParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(TripleJParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void enterBlockItemList(TripleJParser.BlockItemListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void exitBlockItemList(TripleJParser.BlockItemListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void enterBlockItem(TripleJParser.BlockItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void exitBlockItem(TripleJParser.BlockItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(TripleJParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(TripleJParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectionStatement(TripleJParser.SelectionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectionStatement(TripleJParser.SelectionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationStatement(TripleJParser.IterationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationStatement(TripleJParser.IterationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#whileExpression}.
	 * @param ctx the parse tree
	 */
	void enterWhileExpression(TripleJParser.WhileExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#whileExpression}.
	 * @param ctx the parse tree
	 */
	void exitWhileExpression(TripleJParser.WhileExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void enterForCondition(TripleJParser.ForConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void exitForCondition(TripleJParser.ForConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#forDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterForDeclaration(TripleJParser.ForDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#forDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitForDeclaration(TripleJParser.ForDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#forExpression}.
	 * @param ctx the parse tree
	 */
	void enterForExpression(TripleJParser.ForExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#forExpression}.
	 * @param ctx the parse tree
	 */
	void exitForExpression(TripleJParser.ForExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterJumpStatement(TripleJParser.JumpStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitJumpStatement(TripleJParser.JumpStatementContext ctx);
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
	 * Enter a parse tree produced by {@link TripleJParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void enterTranslationUnit(TripleJParser.TranslationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void exitTranslationUnit(TripleJParser.TranslationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterExternalDeclaration(TripleJParser.ExternalDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitExternalDeclaration(TripleJParser.ExternalDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(TripleJParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(TripleJParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TripleJParser#declarationList}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationList(TripleJParser.DeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripleJParser#declarationList}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationList(TripleJParser.DeclarationListContext ctx);
}