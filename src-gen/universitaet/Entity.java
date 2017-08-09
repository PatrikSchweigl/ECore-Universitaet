/**
 */
package universitaet;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link universitaet.Entity#getID <em>ID</em>}</li>
 *   <li>{@link universitaet.Entity#isAusblenden <em>Ausblenden</em>}</li>
 * </ul>
 *
 * @see universitaet.UniversitaetPackage#getEntity()
 * @model abstract="true"
 * @generated
 */
public interface Entity extends EObject {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(int)
	 * @see universitaet.UniversitaetPackage#getEntity_ID()
	 * @model
	 * @generated
	 */
	int getID();

	/**
	 * Sets the value of the '{@link universitaet.Entity#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(int value);

	/**
	 * Returns the value of the '<em><b>Ausblenden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ausblenden</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ausblenden</em>' attribute.
	 * @see #setAusblenden(boolean)
	 * @see universitaet.UniversitaetPackage#getEntity_Ausblenden()
	 * @model
	 * @generated
	 */
	boolean isAusblenden();

	/**
	 * Sets the value of the '{@link universitaet.Entity#isAusblenden <em>Ausblenden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ausblenden</em>' attribute.
	 * @see #isAusblenden()
	 * @generated
	 */
	void setAusblenden(boolean value);

} // Entity
