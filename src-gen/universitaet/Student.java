/**
 */
package universitaet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link universitaet.Student#getMatrikelnummer <em>Matrikelnummer</em>}</li>
 *   <li>{@link universitaet.Student#getSemester <em>Semester</em>}</li>
 * </ul>
 *
 * @see universitaet.UniversitaetPackage#getStudent()
 * @model
 * @generated
 */
public interface Student extends User {
	/**
	 * Returns the value of the '<em><b>Matrikelnummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Matrikelnummer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matrikelnummer</em>' attribute.
	 * @see #setMatrikelnummer(String)
	 * @see universitaet.UniversitaetPackage#getStudent_Matrikelnummer()
	 * @model
	 * @generated
	 */
	String getMatrikelnummer();

	/**
	 * Sets the value of the '{@link universitaet.Student#getMatrikelnummer <em>Matrikelnummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matrikelnummer</em>' attribute.
	 * @see #getMatrikelnummer()
	 * @generated
	 */
	void setMatrikelnummer(String value);

	/**
	 * Returns the value of the '<em><b>Semester</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Semester</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester</em>' attribute.
	 * @see #setSemester(int)
	 * @see universitaet.UniversitaetPackage#getStudent_Semester()
	 * @model
	 * @generated
	 */
	int getSemester();

	/**
	 * Sets the value of the '{@link universitaet.Student#getSemester <em>Semester</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semester</em>' attribute.
	 * @see #getSemester()
	 * @generated
	 */
	void setSemester(int value);

} // Student
