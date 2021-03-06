/**
 * generated by Xtext 2.16.0
 */
package org.xtext.example.mydsl.scheme;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.scheme.Conditional#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.scheme.Conditional#getIftrue <em>Iftrue</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.scheme.Conditional#getElse <em>Else</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.scheme.SchemePackage#getConditional()
 * @model
 * @generated
 */
public interface Conditional extends EObject
{
  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(Comparison)
   * @see org.xtext.example.mydsl.scheme.SchemePackage#getConditional_Condition()
   * @model containment="true"
   * @generated
   */
  Comparison getCondition();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.scheme.Conditional#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(Comparison value);

  /**
   * Returns the value of the '<em><b>Iftrue</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Iftrue</em>' containment reference.
   * @see #setIftrue(Expression)
   * @see org.xtext.example.mydsl.scheme.SchemePackage#getConditional_Iftrue()
   * @model containment="true"
   * @generated
   */
  Expression getIftrue();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.scheme.Conditional#getIftrue <em>Iftrue</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Iftrue</em>' containment reference.
   * @see #getIftrue()
   * @generated
   */
  void setIftrue(Expression value);

  /**
   * Returns the value of the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Else</em>' containment reference.
   * @see #setElse(Expression)
   * @see org.xtext.example.mydsl.scheme.SchemePackage#getConditional_Else()
   * @model containment="true"
   * @generated
   */
  Expression getElse();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.scheme.Conditional#getElse <em>Else</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Else</em>' containment reference.
   * @see #getElse()
   * @generated
   */
  void setElse(Expression value);

} // Conditional
