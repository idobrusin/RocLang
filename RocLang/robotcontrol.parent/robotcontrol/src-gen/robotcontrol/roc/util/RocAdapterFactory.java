/**
 * generated by Xtext 2.10.0
 */
package robotcontrol.roc.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import robotcontrol.roc.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see robotcontrol.roc.RocPackage
 * @generated
 */
public class RocAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static RocPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RocAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = RocPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RocSwitch<Adapter> modelSwitch =
    new RocSwitch<Adapter>()
    {
      @Override
      public Adapter caseProgram(Program object)
      {
        return createProgramAdapter();
      }
      @Override
      public Adapter caseMovement(Movement object)
      {
        return createMovementAdapter();
      }
      @Override
      public Adapter caseMotion(Motion object)
      {
        return createMotionAdapter();
      }
      @Override
      public Adapter caseAction(Action object)
      {
        return createActionAdapter();
      }
      @Override
      public Adapter caseCompleteAction(CompleteAction object)
      {
        return createCompleteActionAdapter();
      }
      @Override
      public Adapter caseSingleAction(SingleAction object)
      {
        return createSingleActionAdapter();
      }
      @Override
      public Adapter caseDirectedAction(DirectedAction object)
      {
        return createDirectedActionAdapter();
      }
      @Override
      public Adapter caseLeftRightDirectedAction(LeftRightDirectedAction object)
      {
        return createLeftRightDirectedActionAdapter();
      }
      @Override
      public Adapter caseLeftRightDirection(LeftRightDirection object)
      {
        return createLeftRightDirectionAdapter();
      }
      @Override
      public Adapter caseFullDirectedAction(FullDirectedAction object)
      {
        return createFullDirectedActionAdapter();
      }
      @Override
      public Adapter caseDirection(Direction object)
      {
        return createDirectionAdapter();
      }
      @Override
      public Adapter caseSpeed(Speed object)
      {
        return createSpeedAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link robotcontrol.roc.Program <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see robotcontrol.roc.Program
   * @generated
   */
  public Adapter createProgramAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link robotcontrol.roc.Movement <em>Movement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see robotcontrol.roc.Movement
   * @generated
   */
  public Adapter createMovementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link robotcontrol.roc.Motion <em>Motion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see robotcontrol.roc.Motion
   * @generated
   */
  public Adapter createMotionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link robotcontrol.roc.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see robotcontrol.roc.Action
   * @generated
   */
  public Adapter createActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link robotcontrol.roc.CompleteAction <em>Complete Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see robotcontrol.roc.CompleteAction
   * @generated
   */
  public Adapter createCompleteActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link robotcontrol.roc.SingleAction <em>Single Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see robotcontrol.roc.SingleAction
   * @generated
   */
  public Adapter createSingleActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link robotcontrol.roc.DirectedAction <em>Directed Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see robotcontrol.roc.DirectedAction
   * @generated
   */
  public Adapter createDirectedActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link robotcontrol.roc.LeftRightDirectedAction <em>Left Right Directed Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see robotcontrol.roc.LeftRightDirectedAction
   * @generated
   */
  public Adapter createLeftRightDirectedActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link robotcontrol.roc.LeftRightDirection <em>Left Right Direction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see robotcontrol.roc.LeftRightDirection
   * @generated
   */
  public Adapter createLeftRightDirectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link robotcontrol.roc.FullDirectedAction <em>Full Directed Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see robotcontrol.roc.FullDirectedAction
   * @generated
   */
  public Adapter createFullDirectedActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link robotcontrol.roc.Direction <em>Direction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see robotcontrol.roc.Direction
   * @generated
   */
  public Adapter createDirectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link robotcontrol.roc.Speed <em>Speed</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see robotcontrol.roc.Speed
   * @generated
   */
  public Adapter createSpeedAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //RocAdapterFactory
