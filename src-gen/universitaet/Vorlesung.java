/**
 */
package universitaet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vorlesung</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link universitaet.Vorlesung#getVorlesungKennung <em>Vorlesung Kennung</em>}</li>
 *   <li>{@link universitaet.Vorlesung#getMitarbeiter <em>Mitarbeiter</em>}</li>
 *   <li>{@link universitaet.Vorlesung#getStudenten <em>Studenten</em>}</li>
 *   <li>{@link universitaet.Vorlesung#getRaum <em>Raum</em>}</li>
 * </ul>
 *
 * @see universitaet.UniversitaetPackage#getVorlesung()
 * @model
 * @generated
 */
public interface Vorlesung extends Entity {
	/**
	 * Returns the value of the '<em><b>Vorlesung Kennung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vorlesung Kennung</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vorlesung Kennung</em>' attribute.
	 * @see #setVorlesungKennung(String)
	 * @see universitaet.UniversitaetPackage#getVorlesung_VorlesungKennung()
	 * @model
	 * @generated
	 */
	String getVorlesungKennung();

	/**
	 * Sets the value of the '{@link universitaet.Vorlesung#getVorlesungKennung <em>Vorlesung Kennung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vorlesung Kennung</em>' attribute.
	 * @see #getVorlesungKennung()
	 * @generated
	 */
	void setVorlesungKennung(String value);

	/**
	 * Returns the value of the '<em><b>Mitarbeiter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mitarbeiter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mitarbeiter</em>' reference.
	 * @see #setMitarbeiter(Mitarbeiter)
	 * @see universitaet.UniversitaetPackage#getVorlesung_Mitarbeiter()
	 * @model required="true"
	 * @generated
	 */
	Mitarbeiter getMitarbeiter();

	/**
	 * Sets the value of the '{@link universitaet.Vorlesung#getMitarbeiter <em>Mitarbeiter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mitarbeiter</em>' reference.
	 * @see #getMitarbeiter()
	 * @generated
	 */
	void setMitarbeiter(Mitarbeiter value);

	/**
	 * Returns the value of the '<em><b>Studenten</b></em>' reference list.
	 * The list contents are of type {@link universitaet.Student}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Studenten</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Studenten</em>' reference list.
	 * @see universitaet.UniversitaetPackage#getVorlesung_Studenten()
	 * @model
	 * @generated
	 */
	EList<Student> getStudenten();

	/**
	 * Returns the value of the '<em><b>Raum</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link universitaet.Raum#getVorlesungen <em>Vorlesungen</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Raum</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Raum</em>' container reference.
	 * @see #setRaum(Raum)
	 * @see universitaet.UniversitaetPackage#getVorlesung_Raum()
	 * @see universitaet.Raum#getVorlesungen
	 * @model opposite="Vorlesungen" required="true" transient="false" derived="true"
	 * @generated
	 */
	Raum getRaum();

	/**
	 * Sets the value of the '{@link universitaet.Vorlesung#getRaum <em>Raum</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Raum</em>' container reference.
	 * @see #getRaum()
	 * @generated
	 */
	void setRaum(Raum value);

} // Vorlesung
