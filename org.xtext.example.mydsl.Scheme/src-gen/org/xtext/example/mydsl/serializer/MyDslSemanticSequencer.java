/*
 * generated by Xtext 2.16.0
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.mydsl.scheme.Body;
import org.xtext.example.mydsl.scheme.Calculate;
import org.xtext.example.mydsl.scheme.Comparison;
import org.xtext.example.mydsl.scheme.Conditional;
import org.xtext.example.mydsl.scheme.Definition;
import org.xtext.example.mydsl.scheme.Expression;
import org.xtext.example.mydsl.scheme.ListLength;
import org.xtext.example.mydsl.scheme.ListNumbers;
import org.xtext.example.mydsl.scheme.NestedOperation;
import org.xtext.example.mydsl.scheme.Operation;
import org.xtext.example.mydsl.scheme.Program;
import org.xtext.example.mydsl.scheme.SchemePackage;
import org.xtext.example.mydsl.scheme.Trigonometry;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == SchemePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case SchemePackage.BODY:
				sequence_Body(context, (Body) semanticObject); 
				return; 
			case SchemePackage.CALCULATE:
				sequence_Calculate(context, (Calculate) semanticObject); 
				return; 
			case SchemePackage.COMPARISON:
				sequence_Comparison(context, (Comparison) semanticObject); 
				return; 
			case SchemePackage.CONDITIONAL:
				sequence_Conditional(context, (Conditional) semanticObject); 
				return; 
			case SchemePackage.DEFINITION:
				sequence_Definition(context, (Definition) semanticObject); 
				return; 
			case SchemePackage.EXPRESSION:
				sequence_Expression(context, (Expression) semanticObject); 
				return; 
			case SchemePackage.LIST_LENGTH:
				sequence_ListLength(context, (ListLength) semanticObject); 
				return; 
			case SchemePackage.LIST_NUMBERS:
				sequence_ListNumbers(context, (ListNumbers) semanticObject); 
				return; 
			case SchemePackage.NESTED_OPERATION:
				sequence_NestedOperation(context, (NestedOperation) semanticObject); 
				return; 
			case SchemePackage.OPERATION:
				sequence_Operation(context, (Operation) semanticObject); 
				return; 
			case SchemePackage.PROGRAM:
				sequence_Program(context, (Program) semanticObject); 
				return; 
			case SchemePackage.SET:
				sequence_Set(context, (org.xtext.example.mydsl.scheme.Set) semanticObject); 
				return; 
			case SchemePackage.TRIGONOMETRY:
				sequence_Trigonometry(context, (Trigonometry) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Body returns Body
	 *
	 * Constraint:
	 *     (definition+=Definition* expression+=Expression+)
	 */
	protected void sequence_Body(ISerializationContext context, Body semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Calculate returns Calculate
	 *
	 * Constraint:
	 *     (calculate=OPER numb+=Number*)
	 */
	protected void sequence_Calculate(ISerializationContext context, Calculate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Comparison returns Comparison
	 *
	 * Constraint:
	 *     (num1=Number num2=Number)?
	 */
	protected void sequence_Comparison(ISerializationContext context, Comparison semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Conditional returns Conditional
	 *
	 * Constraint:
	 *     (condition=Comparison iftrue=Expression else=Expression?)
	 */
	protected void sequence_Conditional(ISerializationContext context, Conditional semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Definition returns Definition
	 *
	 * Constraint:
	 *     ((cons=Constant expression=Expression) | (variable=ID variables+=ID* body=Body))
	 */
	protected void sequence_Definition(ISerializationContext context, Definition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Expression
	 *
	 * Constraint:
	 *     (
	 *         constant=Constant | 
	 *         oper=Operation | 
	 *         comp=Comparison | 
	 *         cond=Conditional | 
	 *         set=Set | 
	 *         trig=Trigonometry | 
	 *         list=ListNumbers | 
	 *         listLength=ListLength | 
	 *         nestedOperation=NestedOperation | 
	 *         calculate=Calculate
	 *     )
	 */
	protected void sequence_Expression(ISerializationContext context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ListLength returns ListLength
	 *
	 * Constraint:
	 *     listNumbers+=ListNumbers
	 */
	protected void sequence_ListLength(ISerializationContext context, ListLength semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ListNumbers returns ListNumbers
	 *
	 * Constraint:
	 *     number+=Number*
	 */
	protected void sequence_ListNumbers(ISerializationContext context, ListNumbers semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     NestedOperation returns NestedOperation
	 *
	 * Constraint:
	 *     (nestedOperation='(' calculate+=Calculate operation+=Operation)
	 */
	protected void sequence_NestedOperation(ISerializationContext context, NestedOperation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Operation returns Operation
	 *
	 * Constraint:
	 *     (operation='(' calculate+=Calculate)
	 */
	protected void sequence_Operation(ISerializationContext context, Operation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Program returns Program
	 *
	 * Constraint:
	 *     (program+=Expression | program+=Definition)+
	 */
	protected void sequence_Program(ISerializationContext context, Program semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Set returns Set
	 *
	 * Constraint:
	 *     (cons=Constant expression=Expression)
	 */
	protected void sequence_Set(ISerializationContext context, org.xtext.example.mydsl.scheme.Set semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SchemePackage.Literals.SET__CONS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SchemePackage.Literals.SET__CONS));
			if (transientValues.isValueTransient(semanticObject, SchemePackage.Literals.SET__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SchemePackage.Literals.SET__EXPRESSION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSetAccess().getConsConstantParserRuleCall_2_0(), semanticObject.getCons());
		feeder.accept(grammarAccess.getSetAccess().getExpressionExpressionParserRuleCall_3_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Trigonometry returns Trigonometry
	 *
	 * Constraint:
	 *     (trig='(' numb+=Number)
	 */
	protected void sequence_Trigonometry(ISerializationContext context, Trigonometry semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
