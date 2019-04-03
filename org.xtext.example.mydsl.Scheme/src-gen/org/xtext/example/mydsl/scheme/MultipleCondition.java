/**
 * generated by Xtext 2.16.0
 */
package org.xtext.example.mydsl.scheme;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiple Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.scheme.MultipleCondition#getComp <em>Comp</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.scheme.MultipleCondition#getExp <em>Exp</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.scheme.MultipleCondition#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.scheme.SchemePackage#getMultipleCondition()
 * @model
 * @generated
 */
public interface MultipleCondition extends EObject
{
  /**
   * Returns the value of the '<em><b>Comp</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.scheme.Comparison}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comp</em>' containment reference list.
   * @see org.xtext.example.mydsl.scheme.SchemePackage#getMultipleCondition_Comp()
   * @model containment="true"
   * @generated
   */
  EList<Comparison> getComp();

  /**
   * Returns the value of the '<em><b>Exp</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.scheme.Expression}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp</em>' containment reference list.
   * @see org.xtext.example.mydsl.scheme.SchemePackage#getMultipleCondition_Exp()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getExp();

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression)
   * @see org.xtext.example.mydsl.scheme.SchemePackage#getMultipleCondition_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.scheme.MultipleCondition#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

} // MultipleCondition
