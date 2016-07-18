/**
 * generated by Xtext 2.10.0
 */
package robot.control.roc.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import robot.control.roc.Action;
import robot.control.roc.Intensity;
import robot.control.roc.RocPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link robot.control.roc.impl.ActionImpl#getActionHolder <em>Action Holder</em>}</li>
 *   <li>{@link robot.control.roc.impl.ActionImpl#getIntensity <em>Intensity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionImpl extends MinimalEObjectImpl.Container implements Action
{
  /**
   * The cached value of the '{@link #getActionHolder() <em>Action Holder</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActionHolder()
   * @generated
   * @ordered
   */
  protected EObject actionHolder;

  /**
   * The default value of the '{@link #getIntensity() <em>Intensity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntensity()
   * @generated
   * @ordered
   */
  protected static final Intensity INTENSITY_EDEFAULT = Intensity.C;

  /**
   * The cached value of the '{@link #getIntensity() <em>Intensity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntensity()
   * @generated
   * @ordered
   */
  protected Intensity intensity = INTENSITY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActionImpl()
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
    return RocPackage.Literals.ACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getActionHolder()
  {
    return actionHolder;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetActionHolder(EObject newActionHolder, NotificationChain msgs)
  {
    EObject oldActionHolder = actionHolder;
    actionHolder = newActionHolder;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RocPackage.ACTION__ACTION_HOLDER, oldActionHolder, newActionHolder);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActionHolder(EObject newActionHolder)
  {
    if (newActionHolder != actionHolder)
    {
      NotificationChain msgs = null;
      if (actionHolder != null)
        msgs = ((InternalEObject)actionHolder).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RocPackage.ACTION__ACTION_HOLDER, null, msgs);
      if (newActionHolder != null)
        msgs = ((InternalEObject)newActionHolder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RocPackage.ACTION__ACTION_HOLDER, null, msgs);
      msgs = basicSetActionHolder(newActionHolder, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RocPackage.ACTION__ACTION_HOLDER, newActionHolder, newActionHolder));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Intensity getIntensity()
  {
    return intensity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIntensity(Intensity newIntensity)
  {
    Intensity oldIntensity = intensity;
    intensity = newIntensity == null ? INTENSITY_EDEFAULT : newIntensity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RocPackage.ACTION__INTENSITY, oldIntensity, intensity));
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
      case RocPackage.ACTION__ACTION_HOLDER:
        return basicSetActionHolder(null, msgs);
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
      case RocPackage.ACTION__ACTION_HOLDER:
        return getActionHolder();
      case RocPackage.ACTION__INTENSITY:
        return getIntensity();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RocPackage.ACTION__ACTION_HOLDER:
        setActionHolder((EObject)newValue);
        return;
      case RocPackage.ACTION__INTENSITY:
        setIntensity((Intensity)newValue);
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
      case RocPackage.ACTION__ACTION_HOLDER:
        setActionHolder((EObject)null);
        return;
      case RocPackage.ACTION__INTENSITY:
        setIntensity(INTENSITY_EDEFAULT);
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
      case RocPackage.ACTION__ACTION_HOLDER:
        return actionHolder != null;
      case RocPackage.ACTION__INTENSITY:
        return intensity != INTENSITY_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (intensity: ");
    result.append(intensity);
    result.append(')');
    return result.toString();
  }

} //ActionImpl
