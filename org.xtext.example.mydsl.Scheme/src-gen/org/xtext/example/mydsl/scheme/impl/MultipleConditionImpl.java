/**
 * generated by Xtext 2.16.0
 */
package org.xtext.example.mydsl.scheme.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.scheme.Comparison;
import org.xtext.example.mydsl.scheme.Expression;
import org.xtext.example.mydsl.scheme.MultipleCondition;
import org.xtext.example.mydsl.scheme.SchemePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multiple Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.scheme.impl.MultipleConditionImpl#getComp <em>Comp</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.scheme.impl.MultipleConditionImpl#getExp <em>Exp</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.scheme.impl.MultipleConditionImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MultipleConditionImpl extends MinimalEObjectImpl.Container implements MultipleCondition
{
  /**
   * The cached value of the '{@link #getComp() <em>Comp</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComp()
   * @generated
   * @ordered
   */
  protected EList<Comparison> comp;

  /**
   * The cached value of the '{@link #getExp() <em>Exp</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExp()
   * @generated
   * @ordered
   */
  protected EList<Expression> exp;

  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected Expression expression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MultipleConditionImpl()
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
    return SchemePackage.Literals.MULTIPLE_CONDITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Comparison> getComp()
  {
    if (comp == null)
    {
      comp = new EObjectContainmentEList<Comparison>(Comparison.class, this, SchemePackage.MULTIPLE_CONDITION__COMP);
    }
    return comp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Expression> getExp()
  {
    if (exp == null)
    {
      exp = new EObjectContainmentEList<Expression>(Expression.class, this, SchemePackage.MULTIPLE_CONDITION__EXP);
    }
    return exp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs)
  {
    Expression oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemePackage.MULTIPLE_CONDITION__EXPRESSION, oldExpression, newExpression);
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
  public void setExpression(Expression newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemePackage.MULTIPLE_CONDITION__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemePackage.MULTIPLE_CONDITION__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SchemePackage.MULTIPLE_CONDITION__EXPRESSION, newExpression, newExpression));
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
      case SchemePackage.MULTIPLE_CONDITION__COMP:
        return ((InternalEList<?>)getComp()).basicRemove(otherEnd, msgs);
      case SchemePackage.MULTIPLE_CONDITION__EXP:
        return ((InternalEList<?>)getExp()).basicRemove(otherEnd, msgs);
      case SchemePackage.MULTIPLE_CONDITION__EXPRESSION:
        return basicSetExpression(null, msgs);
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
      case SchemePackage.MULTIPLE_CONDITION__COMP:
        return getComp();
      case SchemePackage.MULTIPLE_CONDITION__EXP:
        return getExp();
      case SchemePackage.MULTIPLE_CONDITION__EXPRESSION:
        return getExpression();
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
      case SchemePackage.MULTIPLE_CONDITION__COMP:
        getComp().clear();
        getComp().addAll((Collection<? extends Comparison>)newValue);
        return;
      case SchemePackage.MULTIPLE_CONDITION__EXP:
        getExp().clear();
        getExp().addAll((Collection<? extends Expression>)newValue);
        return;
      case SchemePackage.MULTIPLE_CONDITION__EXPRESSION:
        setExpression((Expression)newValue);
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
      case SchemePackage.MULTIPLE_CONDITION__COMP:
        getComp().clear();
        return;
      case SchemePackage.MULTIPLE_CONDITION__EXP:
        getExp().clear();
        return;
      case SchemePackage.MULTIPLE_CONDITION__EXPRESSION:
        setExpression((Expression)null);
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
      case SchemePackage.MULTIPLE_CONDITION__COMP:
        return comp != null && !comp.isEmpty();
      case SchemePackage.MULTIPLE_CONDITION__EXP:
        return exp != null && !exp.isEmpty();
      case SchemePackage.MULTIPLE_CONDITION__EXPRESSION:
        return expression != null;
    }
    return super.eIsSet(featureID);
  }

} //MultipleConditionImpl
