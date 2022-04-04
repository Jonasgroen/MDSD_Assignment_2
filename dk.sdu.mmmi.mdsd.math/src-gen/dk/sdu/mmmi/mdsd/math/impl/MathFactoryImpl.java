/**
 * generated by Xtext 2.26.0
 */
package dk.sdu.mmmi.mdsd.math.impl;

import dk.sdu.mmmi.mdsd.math.Exp;
import dk.sdu.mmmi.mdsd.math.MathExp;
import dk.sdu.mmmi.mdsd.math.MathFactory;
import dk.sdu.mmmi.mdsd.math.MathPackage;
import dk.sdu.mmmi.mdsd.math.Model;
import dk.sdu.mmmi.mdsd.math.MulOrDiv;
import dk.sdu.mmmi.mdsd.math.PlusOrMinus;
import dk.sdu.mmmi.mdsd.math.VariableUse;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MathFactoryImpl extends EFactoryImpl implements MathFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MathFactory init()
  {
    try
    {
      MathFactory theMathFactory = (MathFactory)EPackage.Registry.INSTANCE.getEFactory(MathPackage.eNS_URI);
      if (theMathFactory != null)
      {
        return theMathFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MathFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MathFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MathPackage.MODEL: return createModel();
      case MathPackage.MATH_EXP: return createMathExp();
      case MathPackage.EXP: return createExp();
      case MathPackage.PLUS_OR_MINUS: return createPlusOrMinus();
      case MathPackage.MUL_OR_DIV: return createMulOrDiv();
      case MathPackage.NUMBER: return createNumber();
      case MathPackage.VARIABLE_USE: return createVariableUse();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MathExp createMathExp()
  {
    MathExpImpl mathExp = new MathExpImpl();
    return mathExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Exp createExp()
  {
    ExpImpl exp = new ExpImpl();
    return exp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PlusOrMinus createPlusOrMinus()
  {
    PlusOrMinusImpl plusOrMinus = new PlusOrMinusImpl();
    return plusOrMinus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MulOrDiv createMulOrDiv()
  {
    MulOrDivImpl mulOrDiv = new MulOrDivImpl();
    return mulOrDiv;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public dk.sdu.mmmi.mdsd.math.Number createNumber()
  {
    NumberImpl number = new NumberImpl();
    return number;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VariableUse createVariableUse()
  {
    VariableUseImpl variableUse = new VariableUseImpl();
    return variableUse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MathPackage getMathPackage()
  {
    return (MathPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MathPackage getPackage()
  {
    return MathPackage.eINSTANCE;
  }

} //MathFactoryImpl
