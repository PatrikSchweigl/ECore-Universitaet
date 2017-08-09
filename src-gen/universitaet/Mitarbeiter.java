/**
 */
package universitaet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mitarbeiter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link universitaet.Mitarbeiter#getMitarbeiterKennung <em>Mitarbeiter Kennung</em>}</li>
 *   <li>{@link universitaet.Mitarbeiter#getArbeitsverhaeltnis <em>Arbeitsverhaeltnis</em>}</li>
 * </ul>
 *
 * @see universitaet.UniversitaetPackage#getMitarbeiter()
 * @model
 * @generated
 */
public interface Mitarbeiter extends User {
	/**
	 * Returns the value of the '<em><b>Mitarbeiter Kennung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mitarbeiter Kennung</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mitarbeiter Kennung</em>' attribute.
	 * @see #setMitarbeiterKennung(String)
	 * @see universitaet.UniversitaetPackage#getMitarbeiter_MitarbeiterKennung()
	 * @model
	 * @generated
	 */
	String getMitarbeiterKennung();

	/**
	 * Sets the value of the '{@link universitaet.Mitarbeiter#getMitarbeiterKennung <em>Mitarbeiter Kennung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mitarbeiter Kennung</em>' attribute.
	 * @see #getMitarbeiterKennung()
	 * @generated
	 */
	void setMitarbeiterKennung(String value);

	/**
	 * Returns the value of the '<em><b>Arbeitsverhaeltnis</b></em>' attribute.
	 * The literals are from the enumeration {@link universitaet.Arbeitsverhaeltnis}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arbeitsverhaeltnis</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arbeitsverhaeltnis</em>' attribute.
	 * @see universitaet.Arbeitsverhaeltnis
	 * @see #setArbeitsverhaeltnis(Arbeitsverhaeltnis)
	 * @see universitaet.UniversitaetPackage#getMitarbeiter_Arbeitsverhaeltnis()
	 * @model
	 * @generated
	 */
	Arbeitsverhaeltnis getArbeitsverhaeltnis();

	/**
	 * Sets the value of the '{@link universitaet.Mitarbeiter#getArbeitsverhaeltnis <em>Arbeitsverhaeltnis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arbeitsverhaeltnis</em>' attribute.
	 * @see universitaet.Arbeitsverhaeltnis
	 * @see #getArbeitsverhaeltnis()
	 * @generated
	 */
	void setArbeitsverhaeltnis(Arbeitsverhaeltnis value);

} // Mitarbeiter
