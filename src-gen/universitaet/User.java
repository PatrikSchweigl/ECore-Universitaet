/**
 */
package universitaet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link universitaet.User#getVorname <em>Vorname</em>}</li>
 *   <li>{@link universitaet.User#getNachname <em>Nachname</em>}</li>
 * </ul>
 *
 * @see universitaet.UniversitaetPackage#getUser()
 * @model abstract="true"
 * @generated
 */
public interface User extends Entity {
	/**
	 * Returns the value of the '<em><b>Vorname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vorname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vorname</em>' attribute.
	 * @see #setVorname(String)
	 * @see universitaet.UniversitaetPackage#getUser_Vorname()
	 * @model
	 * @generated
	 */
	String getVorname();

	/**
	 * Sets the value of the '{@link universitaet.User#getVorname <em>Vorname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vorname</em>' attribute.
	 * @see #getVorname()
	 * @generated
	 */
	void setVorname(String value);

	/**
	 * Returns the value of the '<em><b>Nachname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nachname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nachname</em>' attribute.
	 * @see #setNachname(String)
	 * @see universitaet.UniversitaetPackage#getUser_Nachname()
	 * @model
	 * @generated
	 */
	String getNachname();

	/**
	 * Sets the value of the '{@link universitaet.User#getNachname <em>Nachname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nachname</em>' attribute.
	 * @see #getNachname()
	 * @generated
	 */
	void setNachname(String value);

} // User
