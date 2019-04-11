/*
 * generated by Xtext 2.16.0
 */
package org.xtext.example.mydsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.mydsl.ide.contentassist.antlr.internal.InternalMyDslParser;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

public class MyDslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(MyDslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, MyDslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getProgramAccess().getAlternatives(), "rule__Program__Alternatives");
			builder.put(grammarAccess.getDefinitionAccess().getAlternatives(), "rule__Definition__Alternatives");
			builder.put(grammarAccess.getExpressionAccess().getAlternatives(), "rule__Expression__Alternatives");
			builder.put(grammarAccess.getComparisonAccess().getAlternatives_1(), "rule__Comparison__Alternatives_1");
			builder.put(grammarAccess.getComparisonAccess().getAlternatives_1_0_1(), "rule__Comparison__Alternatives_1_0_1");
			builder.put(grammarAccess.getConstantAccess().getAlternatives(), "rule__Constant__Alternatives");
			builder.put(grammarAccess.getNumberAccess().getAlternatives(), "rule__Number__Alternatives");
			builder.put(grammarAccess.getDefinitionAccess().getGroup_0(), "rule__Definition__Group_0__0");
			builder.put(grammarAccess.getDefinitionAccess().getGroup_1(), "rule__Definition__Group_1__0");
			builder.put(grammarAccess.getBodyAccess().getGroup(), "rule__Body__Group__0");
			builder.put(grammarAccess.getComparisonAccess().getGroup(), "rule__Comparison__Group__0");
			builder.put(grammarAccess.getComparisonAccess().getGroup_1_0(), "rule__Comparison__Group_1_0__0");
			builder.put(grammarAccess.getTrigonometryAccess().getGroup(), "rule__Trigonometry__Group__0");
			builder.put(grammarAccess.getSetAccess().getGroup(), "rule__Set__Group__0");
			builder.put(grammarAccess.getConditionalAccess().getGroup(), "rule__Conditional__Group__0");
			builder.put(grammarAccess.getNestedOperationAccess().getGroup(), "rule__NestedOperation__Group__0");
			builder.put(grammarAccess.getOperationAccess().getGroup(), "rule__Operation__Group__0");
			builder.put(grammarAccess.getCalculateAccess().getGroup(), "rule__Calculate__Group__0");
			builder.put(grammarAccess.getListNumbersAccess().getGroup(), "rule__ListNumbers__Group__0");
			builder.put(grammarAccess.getListLengthAccess().getGroup(), "rule__ListLength__Group__0");
			builder.put(grammarAccess.getProgramAccess().getProgramAssignment_0(), "rule__Program__ProgramAssignment_0");
			builder.put(grammarAccess.getProgramAccess().getProgramAssignment_1(), "rule__Program__ProgramAssignment_1");
			builder.put(grammarAccess.getDefinitionAccess().getConsAssignment_0_2(), "rule__Definition__ConsAssignment_0_2");
			builder.put(grammarAccess.getDefinitionAccess().getExpressionAssignment_0_3(), "rule__Definition__ExpressionAssignment_0_3");
			builder.put(grammarAccess.getDefinitionAccess().getVariableAssignment_1_3(), "rule__Definition__VariableAssignment_1_3");
			builder.put(grammarAccess.getDefinitionAccess().getVariablesAssignment_1_4(), "rule__Definition__VariablesAssignment_1_4");
			builder.put(grammarAccess.getDefinitionAccess().getBodyAssignment_1_6(), "rule__Definition__BodyAssignment_1_6");
			builder.put(grammarAccess.getBodyAccess().getDefinitionAssignment_0(), "rule__Body__DefinitionAssignment_0");
			builder.put(grammarAccess.getBodyAccess().getExpressionAssignment_1(), "rule__Body__ExpressionAssignment_1");
			builder.put(grammarAccess.getExpressionAccess().getConstantAssignment_0(), "rule__Expression__ConstantAssignment_0");
			builder.put(grammarAccess.getExpressionAccess().getOperAssignment_1(), "rule__Expression__OperAssignment_1");
			builder.put(grammarAccess.getExpressionAccess().getCompAssignment_2(), "rule__Expression__CompAssignment_2");
			builder.put(grammarAccess.getExpressionAccess().getCondAssignment_3(), "rule__Expression__CondAssignment_3");
			builder.put(grammarAccess.getExpressionAccess().getSetAssignment_4(), "rule__Expression__SetAssignment_4");
			builder.put(grammarAccess.getExpressionAccess().getTrigAssignment_5(), "rule__Expression__TrigAssignment_5");
			builder.put(grammarAccess.getExpressionAccess().getListAssignment_6(), "rule__Expression__ListAssignment_6");
			builder.put(grammarAccess.getExpressionAccess().getListLengthAssignment_7(), "rule__Expression__ListLengthAssignment_7");
			builder.put(grammarAccess.getExpressionAccess().getNestedOperationAssignment_8(), "rule__Expression__NestedOperationAssignment_8");
			builder.put(grammarAccess.getExpressionAccess().getCalculateAssignment_9(), "rule__Expression__CalculateAssignment_9");
			builder.put(grammarAccess.getComparisonAccess().getNum1Assignment_1_0_2(), "rule__Comparison__Num1Assignment_1_0_2");
			builder.put(grammarAccess.getComparisonAccess().getNum2Assignment_1_0_3(), "rule__Comparison__Num2Assignment_1_0_3");
			builder.put(grammarAccess.getTrigonometryAccess().getTrigAssignment_0(), "rule__Trigonometry__TrigAssignment_0");
			builder.put(grammarAccess.getTrigonometryAccess().getNumbAssignment_2(), "rule__Trigonometry__NumbAssignment_2");
			builder.put(grammarAccess.getSetAccess().getConsAssignment_2(), "rule__Set__ConsAssignment_2");
			builder.put(grammarAccess.getSetAccess().getExpressionAssignment_3(), "rule__Set__ExpressionAssignment_3");
			builder.put(grammarAccess.getConditionalAccess().getConditionAssignment_2(), "rule__Conditional__ConditionAssignment_2");
			builder.put(grammarAccess.getConditionalAccess().getIftrueAssignment_3(), "rule__Conditional__IftrueAssignment_3");
			builder.put(grammarAccess.getConditionalAccess().getElseAssignment_4(), "rule__Conditional__ElseAssignment_4");
			builder.put(grammarAccess.getNestedOperationAccess().getNestedOperationAssignment_0(), "rule__NestedOperation__NestedOperationAssignment_0");
			builder.put(grammarAccess.getNestedOperationAccess().getCalculateAssignment_1(), "rule__NestedOperation__CalculateAssignment_1");
			builder.put(grammarAccess.getNestedOperationAccess().getOperationAssignment_2(), "rule__NestedOperation__OperationAssignment_2");
			builder.put(grammarAccess.getOperationAccess().getOperationAssignment_0(), "rule__Operation__OperationAssignment_0");
			builder.put(grammarAccess.getOperationAccess().getCalculateAssignment_1(), "rule__Operation__CalculateAssignment_1");
			builder.put(grammarAccess.getCalculateAccess().getCalculateAssignment_0(), "rule__Calculate__CalculateAssignment_0");
			builder.put(grammarAccess.getCalculateAccess().getNumbAssignment_1(), "rule__Calculate__NumbAssignment_1");
			builder.put(grammarAccess.getListNumbersAccess().getNumberAssignment_3(), "rule__ListNumbers__NumberAssignment_3");
			builder.put(grammarAccess.getListLengthAccess().getListNumbersAssignment_3(), "rule__ListLength__ListNumbersAssignment_3");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private MyDslGrammarAccess grammarAccess;

	@Override
	protected InternalMyDslParser createParser() {
		InternalMyDslParser result = new InternalMyDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MyDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
