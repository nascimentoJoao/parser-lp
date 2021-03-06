/**
 * generated by Xtext 2.16.0
 */
package org.xtext.example.mydsl.scheme;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nested Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.scheme.NestedOperation#getNestedOperation <em>Nested Operation</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.scheme.NestedOperation#getCalculate <em>Calculate</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.scheme.NestedOperation#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.scheme.SchemePackage#getNestedOperation()
 * @model
 * @generated
 */
public interface NestedOperation extends EObject
{
  /**
   * Returns the value of the '<em><b>Nested Operation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nested Operation</em>' attribute.
   * @see #setNestedOperation(String)
   * @see org.xtext.example.mydsl.scheme.SchemePackage#getNestedOperation_NestedOperation()
   * @model
   * @generated
   */
  String getNestedOperation();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.scheme.NestedOperation#getNestedOperation <em>Nested Operation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nested Operation</em>' attribute.
   * @see #getNestedOperation()
   * @generated
   */
  void setNestedOperation(String value);

  /**
   * Returns the value of the '<em><b>Calculate</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.scheme.Calculate}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Calculate</em>' containment reference list.
   * @see org.xtext.example.mydsl.scheme.SchemePackage#getNestedOperation_Calculate()
   * @model containment="true"
   * @generated
   */
  EList<Calculate> getCalculate();

  /**
   * Returns the value of the '<em><b>Operation</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.scheme.Operation}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operation</em>' containment reference list.
   * @see org.xtext.example.mydsl.scheme.SchemePackage#getNestedOperation_Operation()
   * @model containment="true"
   * @generated
   */
  EList<Operation> getOperation();

} // NestedOperation
