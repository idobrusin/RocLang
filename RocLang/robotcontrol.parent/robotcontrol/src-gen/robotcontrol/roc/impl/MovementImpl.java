/**
 * generated by Xtext 2.10.0
 */
package robotcontrol.roc.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import robotcontrol.roc.Motion;
import robotcontrol.roc.Movement;
import robotcontrol.roc.RocPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Movement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link robotcontrol.roc.impl.MovementImpl#getMotions <em>Motions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MovementImpl extends MinimalEObjectImpl.Container implements Movement
{
  /**
   * The cached value of the '{@link #getMotions() <em>Motions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMotions()
   * @generated
   * @ordered
   */
  protected EList<Motion> motions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MovementImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return RocPackage.Literals.MOVEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Motion> getMotions()
  {
    if (motions == null)
    {
      motions = new EObjectContainmentEList<Motion>(Motion.class, this, RocPackage.MOVEMENT__MOTIONS);
    }
    return motions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case RocPackage.MOVEMENT__MOTIONS:
        return ((InternalEList<?>)getMotions()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case RocPackage.MOVEMENT__MOTIONS:
        return getMotions();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RocPackage.MOVEMENT__MOTIONS:
        getMotions().clear();
        getMotions().addAll((Collection<? extends Motion>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case RocPackage.MOVEMENT__MOTIONS:
        getMotions().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case RocPackage.MOVEMENT__MOTIONS:
        return motions != null && !motions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //MovementImpl
