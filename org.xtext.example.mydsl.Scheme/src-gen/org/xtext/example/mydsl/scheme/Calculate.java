/**
 * generated by Xtext 2.16.0
 */
package org.xtext.example.mydsl.scheme;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calculate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.scheme.Calculate#getCalculate <em>Calculate</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.scheme.Calculate#getNumb <em>Numb</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.scheme.SchemePackage#getCalculate()
 * @model
 * @generated
 */
public interface Calculate extends EObject
{
  /**
   * Returns the value of the '<em><b>Calculate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Calculate</em>' attribute.
   * @see #setCalculate(String)
   * @see org.xtext.example.mydsl.scheme.SchemePackage#getCalculate_Calculate()
   * @model
   * @generated
   */
  String getCalculate();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.scheme.Calculate#getCalculate <em>Calculate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Calculate</em>' attribute.
   * @see #getCalculate()
   * @generated
   */
  void setCalculate(String value);

  /**
   * Returns the value of the '<em><b>Numb</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Numb</em>' attribute list.
   * @see org.xtext.example.mydsl.scheme.SchemePackage#getCalculate_Numb()
   * @model unique="false"
   * @generated
   */
  EList<String> getNumb();

} // Calculate