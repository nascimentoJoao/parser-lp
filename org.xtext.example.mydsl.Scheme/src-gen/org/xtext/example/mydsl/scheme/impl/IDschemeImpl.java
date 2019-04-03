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

import org.xtext.example.mydsl.scheme.IDscheme;
import org.xtext.example.mydsl.scheme.Initial;
import org.xtext.example.mydsl.scheme.SchemePackage;
import org.xtext.example.mydsl.scheme.Subsequent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IDscheme</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.scheme.impl.IDschemeImpl#getInit <em>Init</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.scheme.impl.IDschemeImpl#getSubs <em>Subs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IDschemeImpl extends MinimalEObjectImpl.Container implements IDscheme
{
  /**
   * The cached value of the '{@link #getInit() <em>Init</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInit()
   * @generated
   * @ordered
   */
  protected Initial init;

  /**
   * The cached value of the '{@link #getSubs() <em>Subs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubs()
   * @generated
   * @ordered
   */
  protected EList<Subsequent> subs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IDschemeImpl()
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
    return SchemePackage.Literals.IDSCHEME;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Initial getInit()
  {
    return init;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInit(Initial newInit, NotificationChain msgs)
  {
    Initial oldInit = init;
    init = newInit;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemePackage.IDSCHEME__INIT, oldInit, newInit);
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
  public void setInit(Initial newInit)
  {
    if (newInit != init)
    {
      NotificationChain msgs = null;
      if (init != null)
        msgs = ((InternalEObject)init).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemePackage.IDSCHEME__INIT, null, msgs);
      if (newInit != null)
        msgs = ((InternalEObject)newInit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemePackage.IDSCHEME__INIT, null, msgs);
      msgs = basicSetInit(newInit, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SchemePackage.IDSCHEME__INIT, newInit, newInit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Subsequent> getSubs()
  {
    if (subs == null)
    {
      subs = new EObjectContainmentEList<Subsequent>(Subsequent.class, this, SchemePackage.IDSCHEME__SUBS);
    }
    return subs;
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
      case SchemePackage.IDSCHEME__INIT:
        return basicSetInit(null, msgs);
      case SchemePackage.IDSCHEME__SUBS:
        return ((InternalEList<?>)getSubs()).basicRemove(otherEnd, msgs);
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
      case SchemePackage.IDSCHEME__INIT:
        return getInit();
      case SchemePackage.IDSCHEME__SUBS:
        return getSubs();
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
      case SchemePackage.IDSCHEME__INIT:
        setInit((Initial)newValue);
        return;
      case SchemePackage.IDSCHEME__SUBS:
        getSubs().clear();
        getSubs().addAll((Collection<? extends Subsequent>)newValue);
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
      case SchemePackage.IDSCHEME__INIT:
        setInit((Initial)null);
        return;
      case SchemePackage.IDSCHEME__SUBS:
        getSubs().clear();
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
      case SchemePackage.IDSCHEME__INIT:
        return init != null;
      case SchemePackage.IDSCHEME__SUBS:
        return subs != null && !subs.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //IDschemeImpl
