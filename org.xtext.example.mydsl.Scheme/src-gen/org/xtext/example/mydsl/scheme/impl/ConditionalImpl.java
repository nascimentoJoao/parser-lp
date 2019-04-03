/**
 * generated by Xtext 2.16.0
 */
package org.xtext.example.mydsl.scheme.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.scheme.Comparison;
import org.xtext.example.mydsl.scheme.Conditional;
import org.xtext.example.mydsl.scheme.Expression;
import org.xtext.example.mydsl.scheme.SchemePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.scheme.impl.ConditionalImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.scheme.impl.ConditionalImpl#getIftrue <em>Iftrue</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.scheme.impl.ConditionalImpl#getElse <em>Else</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionalImpl extends MinimalEObjectImpl.Container implements Conditional
{
  /**
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected Comparison condition;

  /**
   * The cached value of the '{@link #getIftrue() <em>Iftrue</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIftrue()
   * @generated
   * @ordered
   */
  protected Expression iftrue;

  /**
   * The cached value of the '{@link #getElse() <em>Else</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElse()
   * @generated
   * @ordered
   */
  protected Expression else_;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConditionalImpl()
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
    return SchemePackage.Literals.CONDITIONAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Comparison getCondition()
  {
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCondition(Comparison newCondition, NotificationChain msgs)
  {
    Comparison oldCondition = condition;
    condition = newCondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemePackage.CONDITIONAL__CONDITION, oldCondition, newCondition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCondition(Comparison newCondition)
  {
    if (newCondition != condition)
    {
      NotificationChain msgs = null;
      if (condition != null)
        msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemePackage.CONDITIONAL__CONDITION, null, msgs);
      if (newCondition != null)
        msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemePackage.CONDITIONAL__CONDITION, null, msgs);
      msgs = basicSetCondition(newCondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SchemePackage.CONDITIONAL__CONDITION, newCondition, newCondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getIftrue()
  {
    return iftrue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIftrue(Expression newIftrue, NotificationChain msgs)
  {
    Expression oldIftrue = iftrue;
    iftrue = newIftrue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemePackage.CONDITIONAL__IFTRUE, oldIftrue, newIftrue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setIftrue(Expression newIftrue)
  {
    if (newIftrue != iftrue)
    {
      NotificationChain msgs = null;
      if (iftrue != null)
        msgs = ((InternalEObject)iftrue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemePackage.CONDITIONAL__IFTRUE, null, msgs);
      if (newIftrue != null)
        msgs = ((InternalEObject)newIftrue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemePackage.CONDITIONAL__IFTRUE, null, msgs);
      msgs = basicSetIftrue(newIftrue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SchemePackage.CONDITIONAL__IFTRUE, newIftrue, newIftrue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getElse()
  {
    return else_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElse(Expression newElse, NotificationChain msgs)
  {
    Expression oldElse = else_;
    else_ = newElse;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemePackage.CONDITIONAL__ELSE, oldElse, newElse);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setElse(Expression newElse)
  {
    if (newElse != else_)
    {
      NotificationChain msgs = null;
      if (else_ != null)
        msgs = ((InternalEObject)else_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemePackage.CONDITIONAL__ELSE, null, msgs);
      if (newElse != null)
        msgs = ((InternalEObject)newElse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemePackage.CONDITIONAL__ELSE, null, msgs);
      msgs = basicSetElse(newElse, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SchemePackage.CONDITIONAL__ELSE, newElse, newElse));
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
      case SchemePackage.CONDITIONAL__CONDITION:
        return basicSetCondition(null, msgs);
      case SchemePackage.CONDITIONAL__IFTRUE:
        return basicSetIftrue(null, msgs);
      case SchemePackage.CONDITIONAL__ELSE:
        return basicSetElse(null, msgs);
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
      case SchemePackage.CONDITIONAL__CONDITION:
        return getCondition();
      case SchemePackage.CONDITIONAL__IFTRUE:
        return getIftrue();
      case SchemePackage.CONDITIONAL__ELSE:
        return getElse();
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
      case SchemePackage.CONDITIONAL__CONDITION:
        setCondition((Comparison)newValue);
        return;
      case SchemePackage.CONDITIONAL__IFTRUE:
        setIftrue((Expression)newValue);
        return;
      case SchemePackage.CONDITIONAL__ELSE:
        setElse((Expression)newValue);
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
      case SchemePackage.CONDITIONAL__CONDITION:
        setCondition((Comparison)null);
        return;
      case SchemePackage.CONDITIONAL__IFTRUE:
        setIftrue((Expression)null);
        return;
      case SchemePackage.CONDITIONAL__ELSE:
        setElse((Expression)null);
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
      case SchemePackage.CONDITIONAL__CONDITION:
        return condition != null;
      case SchemePackage.CONDITIONAL__IFTRUE:
        return iftrue != null;
      case SchemePackage.CONDITIONAL__ELSE:
        return else_ != null;
    }
    return super.eIsSet(featureID);
  }

} //ConditionalImpl