/*
 * generated by Xtext 2.26.0
 */
package dk.sdu.mmmi.mdsd.serializer;

import com.google.inject.Inject;
import dk.sdu.mmmi.mdsd.math.MathExp;
import dk.sdu.mmmi.mdsd.math.MathPackage;
import dk.sdu.mmmi.mdsd.math.Model;
import dk.sdu.mmmi.mdsd.math.MulOrDiv;
import dk.sdu.mmmi.mdsd.math.PlusOrMinus;
import dk.sdu.mmmi.mdsd.math.VariableUse;
import dk.sdu.mmmi.mdsd.services.MathGrammarAccess;
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

@SuppressWarnings("all")
public class MathSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MathGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MathPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MathPackage.MATH_EXP:
				sequence_MathExp(context, (MathExp) semanticObject); 
				return; 
			case MathPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case MathPackage.MUL_OR_DIV:
				sequence_MulOrDiv(context, (MulOrDiv) semanticObject); 
				return; 
			case MathPackage.NUMBER:
				sequence_Primary(context, (dk.sdu.mmmi.mdsd.math.Number) semanticObject); 
				return; 
			case MathPackage.PLUS_OR_MINUS:
				sequence_PlusOrMinus(context, (PlusOrMinus) semanticObject); 
				return; 
			case MathPackage.VARIABLE_USE:
				sequence_Primary(context, (VariableUse) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     MathExp returns MathExp
	 *
	 * Constraint:
	 *     (name=ID exp=Exp)
	 * </pre>
	 */
	protected void sequence_MathExp(ISerializationContext context, MathExp semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MathPackage.Literals.MATH_EXP__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathPackage.Literals.MATH_EXP__NAME));
			if (transientValues.isValueTransient(semanticObject, MathPackage.Literals.MATH_EXP__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathPackage.Literals.MATH_EXP__EXP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMathExpAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getMathExpAccess().getExpExpParserRuleCall_3_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     items+=MathExp+
	 * </pre>
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Exp returns MulOrDiv
	 *     PlusOrMinus returns MulOrDiv
	 *     PlusOrMinus.PlusOrMinus_1_0_0 returns MulOrDiv
	 *     MulOrDiv returns MulOrDiv
	 *     MulOrDiv.MulOrDiv_1_0 returns MulOrDiv
	 *     Primary returns MulOrDiv
	 *
	 * Constraint:
	 *     (left=MulOrDiv_MulOrDiv_1_0 (operator='*' | operator='/') right=Primary)
	 * </pre>
	 */
	protected void sequence_MulOrDiv(ISerializationContext context, MulOrDiv semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Exp returns PlusOrMinus
	 *     PlusOrMinus returns PlusOrMinus
	 *     PlusOrMinus.PlusOrMinus_1_0_0 returns PlusOrMinus
	 *     MulOrDiv returns PlusOrMinus
	 *     MulOrDiv.MulOrDiv_1_0 returns PlusOrMinus
	 *     Primary returns PlusOrMinus
	 *
	 * Constraint:
	 *     (left=PlusOrMinus_PlusOrMinus_1_0_0 (operator='+' | operator='-') right=MulOrDiv)
	 * </pre>
	 */
	protected void sequence_PlusOrMinus(ISerializationContext context, PlusOrMinus semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Exp returns Number
	 *     PlusOrMinus returns Number
	 *     PlusOrMinus.PlusOrMinus_1_0_0 returns Number
	 *     MulOrDiv returns Number
	 *     MulOrDiv.MulOrDiv_1_0 returns Number
	 *     Primary returns Number
	 *
	 * Constraint:
	 *     value=INT
	 * </pre>
	 */
	protected void sequence_Primary(ISerializationContext context, dk.sdu.mmmi.mdsd.math.Number semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MathPackage.Literals.NUMBER__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathPackage.Literals.NUMBER__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPrimaryAccess().getValueINTTerminalRuleCall_1_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Exp returns VariableUse
	 *     PlusOrMinus returns VariableUse
	 *     PlusOrMinus.PlusOrMinus_1_0_0 returns VariableUse
	 *     MulOrDiv returns VariableUse
	 *     MulOrDiv.MulOrDiv_1_0 returns VariableUse
	 *     Primary returns VariableUse
	 *
	 * Constraint:
	 *     ref=[MathExp|ID]
	 * </pre>
	 */
	protected void sequence_Primary(ISerializationContext context, VariableUse semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MathPackage.Literals.VARIABLE_USE__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathPackage.Literals.VARIABLE_USE__REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPrimaryAccess().getRefMathExpIDTerminalRuleCall_2_1_0_1(), semanticObject.eGet(MathPackage.Literals.VARIABLE_USE__REF, false));
		feeder.finish();
	}
	
	
}