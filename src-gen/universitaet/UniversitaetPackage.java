/**
 */
package universitaet;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see universitaet.UniversitaetFactory
 * @model kind="package"
 * @generated
 */
public interface UniversitaetPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "universitaet";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/universitaet";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "universitaet";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UniversitaetPackage eINSTANCE = universitaet.impl.UniversitaetPackageImpl.init();

	/**
	 * The meta object id for the '{@link universitaet.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universitaet.impl.EntityImpl
	 * @see universitaet.impl.UniversitaetPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ID = 0;

	/**
	 * The feature id for the '<em><b>Ausblenden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__AUSBLENDEN = 1;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link universitaet.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universitaet.impl.UserImpl
	 * @see universitaet.impl.UniversitaetPackageImpl#getUser()
	 * @generated
	 */
	int USER = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ID = ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Ausblenden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__AUSBLENDEN = ENTITY__AUSBLENDEN;

	/**
	 * The feature id for the '<em><b>Vorname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__VORNAME = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nachname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__NACHNAME = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link universitaet.impl.MitarbeiterImpl <em>Mitarbeiter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universitaet.impl.MitarbeiterImpl
	 * @see universitaet.impl.UniversitaetPackageImpl#getMitarbeiter()
	 * @generated
	 */
	int MITARBEITER = 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MITARBEITER__ID = USER__ID;

	/**
	 * The feature id for the '<em><b>Ausblenden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MITARBEITER__AUSBLENDEN = USER__AUSBLENDEN;

	/**
	 * The feature id for the '<em><b>Vorname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MITARBEITER__VORNAME = USER__VORNAME;

	/**
	 * The feature id for the '<em><b>Nachname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MITARBEITER__NACHNAME = USER__NACHNAME;

	/**
	 * The feature id for the '<em><b>Mitarbeiter Kennung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MITARBEITER__MITARBEITER_KENNUNG = USER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arbeitsverhaeltnis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MITARBEITER__ARBEITSVERHAELTNIS = USER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Mitarbeiter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MITARBEITER_FEATURE_COUNT = USER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Mitarbeiter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MITARBEITER_OPERATION_COUNT = USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link universitaet.impl.StudentImpl <em>Student</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universitaet.impl.StudentImpl
	 * @see universitaet.impl.UniversitaetPackageImpl#getStudent()
	 * @generated
	 */
	int STUDENT = 3;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__ID = USER__ID;

	/**
	 * The feature id for the '<em><b>Ausblenden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__AUSBLENDEN = USER__AUSBLENDEN;

	/**
	 * The feature id for the '<em><b>Vorname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__VORNAME = USER__VORNAME;

	/**
	 * The feature id for the '<em><b>Nachname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__NACHNAME = USER__NACHNAME;

	/**
	 * The feature id for the '<em><b>Matrikelnummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__MATRIKELNUMMER = USER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Semester</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__SEMESTER = USER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Student</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_FEATURE_COUNT = USER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Student</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_OPERATION_COUNT = USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link universitaet.impl.VorlesungImpl <em>Vorlesung</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universitaet.impl.VorlesungImpl
	 * @see universitaet.impl.UniversitaetPackageImpl#getVorlesung()
	 * @generated
	 */
	int VORLESUNG = 4;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORLESUNG__ID = ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Ausblenden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORLESUNG__AUSBLENDEN = ENTITY__AUSBLENDEN;

	/**
	 * The feature id for the '<em><b>Vorlesung Kennung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORLESUNG__VORLESUNG_KENNUNG = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mitarbeiter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORLESUNG__MITARBEITER = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Studenten</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORLESUNG__STUDENTEN = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Raum</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORLESUNG__RAUM = ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Vorlesung</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORLESUNG_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Vorlesung</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORLESUNG_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link universitaet.impl.GebaeudeImpl <em>Gebaeude</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universitaet.impl.GebaeudeImpl
	 * @see universitaet.impl.UniversitaetPackageImpl#getGebaeude()
	 * @generated
	 */
	int GEBAEUDE = 5;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEBAEUDE__ID = ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Ausblenden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEBAEUDE__AUSBLENDEN = ENTITY__AUSBLENDEN;

	/**
	 * The feature id for the '<em><b>Gebaeude Kennung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEBAEUDE__GEBAEUDE_KENNUNG = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Raeume</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEBAEUDE__RAEUME = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gebaeude</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEBAEUDE_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Gebaeude</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEBAEUDE_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link universitaet.impl.RaumImpl <em>Raum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universitaet.impl.RaumImpl
	 * @see universitaet.impl.UniversitaetPackageImpl#getRaum()
	 * @generated
	 */
	int RAUM = 6;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAUM__ID = ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Ausblenden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAUM__AUSBLENDEN = ENTITY__AUSBLENDEN;

	/**
	 * The feature id for the '<em><b>Raum Kennung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAUM__RAUM_KENNUNG = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Vorlesungen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAUM__VORLESUNGEN = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Raum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAUM_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Raum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAUM_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link universitaet.Arbeitsverhaeltnis <em>Arbeitsverhaeltnis</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universitaet.Arbeitsverhaeltnis
	 * @see universitaet.impl.UniversitaetPackageImpl#getArbeitsverhaeltnis()
	 * @generated
	 */
	int ARBEITSVERHAELTNIS = 7;

	/**
	 * Returns the meta object for class '{@link universitaet.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see universitaet.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the attribute '{@link universitaet.Entity#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see universitaet.Entity#getID()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_ID();

	/**
	 * Returns the meta object for the attribute '{@link universitaet.Entity#isAusblenden <em>Ausblenden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ausblenden</em>'.
	 * @see universitaet.Entity#isAusblenden()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Ausblenden();

	/**
	 * Returns the meta object for class '{@link universitaet.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see universitaet.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link universitaet.User#getVorname <em>Vorname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vorname</em>'.
	 * @see universitaet.User#getVorname()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Vorname();

	/**
	 * Returns the meta object for the attribute '{@link universitaet.User#getNachname <em>Nachname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nachname</em>'.
	 * @see universitaet.User#getNachname()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Nachname();

	/**
	 * Returns the meta object for class '{@link universitaet.Mitarbeiter <em>Mitarbeiter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mitarbeiter</em>'.
	 * @see universitaet.Mitarbeiter
	 * @generated
	 */
	EClass getMitarbeiter();

	/**
	 * Returns the meta object for the attribute '{@link universitaet.Mitarbeiter#getMitarbeiterKennung <em>Mitarbeiter Kennung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mitarbeiter Kennung</em>'.
	 * @see universitaet.Mitarbeiter#getMitarbeiterKennung()
	 * @see #getMitarbeiter()
	 * @generated
	 */
	EAttribute getMitarbeiter_MitarbeiterKennung();

	/**
	 * Returns the meta object for the attribute '{@link universitaet.Mitarbeiter#getArbeitsverhaeltnis <em>Arbeitsverhaeltnis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arbeitsverhaeltnis</em>'.
	 * @see universitaet.Mitarbeiter#getArbeitsverhaeltnis()
	 * @see #getMitarbeiter()
	 * @generated
	 */
	EAttribute getMitarbeiter_Arbeitsverhaeltnis();

	/**
	 * Returns the meta object for class '{@link universitaet.Student <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Student</em>'.
	 * @see universitaet.Student
	 * @generated
	 */
	EClass getStudent();

	/**
	 * Returns the meta object for the attribute '{@link universitaet.Student#getMatrikelnummer <em>Matrikelnummer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Matrikelnummer</em>'.
	 * @see universitaet.Student#getMatrikelnummer()
	 * @see #getStudent()
	 * @generated
	 */
	EAttribute getStudent_Matrikelnummer();

	/**
	 * Returns the meta object for the attribute '{@link universitaet.Student#getSemester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semester</em>'.
	 * @see universitaet.Student#getSemester()
	 * @see #getStudent()
	 * @generated
	 */
	EAttribute getStudent_Semester();

	/**
	 * Returns the meta object for class '{@link universitaet.Vorlesung <em>Vorlesung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vorlesung</em>'.
	 * @see universitaet.Vorlesung
	 * @generated
	 */
	EClass getVorlesung();

	/**
	 * Returns the meta object for the attribute '{@link universitaet.Vorlesung#getVorlesungKennung <em>Vorlesung Kennung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vorlesung Kennung</em>'.
	 * @see universitaet.Vorlesung#getVorlesungKennung()
	 * @see #getVorlesung()
	 * @generated
	 */
	EAttribute getVorlesung_VorlesungKennung();

	/**
	 * Returns the meta object for the reference '{@link universitaet.Vorlesung#getMitarbeiter <em>Mitarbeiter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mitarbeiter</em>'.
	 * @see universitaet.Vorlesung#getMitarbeiter()
	 * @see #getVorlesung()
	 * @generated
	 */
	EReference getVorlesung_Mitarbeiter();

	/**
	 * Returns the meta object for the reference list '{@link universitaet.Vorlesung#getStudenten <em>Studenten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Studenten</em>'.
	 * @see universitaet.Vorlesung#getStudenten()
	 * @see #getVorlesung()
	 * @generated
	 */
	EReference getVorlesung_Studenten();

	/**
	 * Returns the meta object for the container reference '{@link universitaet.Vorlesung#getRaum <em>Raum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Raum</em>'.
	 * @see universitaet.Vorlesung#getRaum()
	 * @see #getVorlesung()
	 * @generated
	 */
	EReference getVorlesung_Raum();

	/**
	 * Returns the meta object for class '{@link universitaet.Gebaeude <em>Gebaeude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gebaeude</em>'.
	 * @see universitaet.Gebaeude
	 * @generated
	 */
	EClass getGebaeude();

	/**
	 * Returns the meta object for the attribute '{@link universitaet.Gebaeude#getGebaeudeKennung <em>Gebaeude Kennung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gebaeude Kennung</em>'.
	 * @see universitaet.Gebaeude#getGebaeudeKennung()
	 * @see #getGebaeude()
	 * @generated
	 */
	EAttribute getGebaeude_GebaeudeKennung();

	/**
	 * Returns the meta object for the reference list '{@link universitaet.Gebaeude#getRaeume <em>Raeume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Raeume</em>'.
	 * @see universitaet.Gebaeude#getRaeume()
	 * @see #getGebaeude()
	 * @generated
	 */
	EReference getGebaeude_Raeume();

	/**
	 * Returns the meta object for class '{@link universitaet.Raum <em>Raum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Raum</em>'.
	 * @see universitaet.Raum
	 * @generated
	 */
	EClass getRaum();

	/**
	 * Returns the meta object for the attribute '{@link universitaet.Raum#getRaumKennung <em>Raum Kennung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Raum Kennung</em>'.
	 * @see universitaet.Raum#getRaumKennung()
	 * @see #getRaum()
	 * @generated
	 */
	EAttribute getRaum_RaumKennung();

	/**
	 * Returns the meta object for the containment reference list '{@link universitaet.Raum#getVorlesungen <em>Vorlesungen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vorlesungen</em>'.
	 * @see universitaet.Raum#getVorlesungen()
	 * @see #getRaum()
	 * @generated
	 */
	EReference getRaum_Vorlesungen();

	/**
	 * Returns the meta object for enum '{@link universitaet.Arbeitsverhaeltnis <em>Arbeitsverhaeltnis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Arbeitsverhaeltnis</em>'.
	 * @see universitaet.Arbeitsverhaeltnis
	 * @generated
	 */
	EEnum getArbeitsverhaeltnis();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UniversitaetFactory getUniversitaetFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link universitaet.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universitaet.impl.EntityImpl
		 * @see universitaet.impl.UniversitaetPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__ID = eINSTANCE.getEntity_ID();

		/**
		 * The meta object literal for the '<em><b>Ausblenden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__AUSBLENDEN = eINSTANCE.getEntity_Ausblenden();

		/**
		 * The meta object literal for the '{@link universitaet.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universitaet.impl.UserImpl
		 * @see universitaet.impl.UniversitaetPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Vorname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__VORNAME = eINSTANCE.getUser_Vorname();

		/**
		 * The meta object literal for the '<em><b>Nachname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__NACHNAME = eINSTANCE.getUser_Nachname();

		/**
		 * The meta object literal for the '{@link universitaet.impl.MitarbeiterImpl <em>Mitarbeiter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universitaet.impl.MitarbeiterImpl
		 * @see universitaet.impl.UniversitaetPackageImpl#getMitarbeiter()
		 * @generated
		 */
		EClass MITARBEITER = eINSTANCE.getMitarbeiter();

		/**
		 * The meta object literal for the '<em><b>Mitarbeiter Kennung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MITARBEITER__MITARBEITER_KENNUNG = eINSTANCE.getMitarbeiter_MitarbeiterKennung();

		/**
		 * The meta object literal for the '<em><b>Arbeitsverhaeltnis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MITARBEITER__ARBEITSVERHAELTNIS = eINSTANCE.getMitarbeiter_Arbeitsverhaeltnis();

		/**
		 * The meta object literal for the '{@link universitaet.impl.StudentImpl <em>Student</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universitaet.impl.StudentImpl
		 * @see universitaet.impl.UniversitaetPackageImpl#getStudent()
		 * @generated
		 */
		EClass STUDENT = eINSTANCE.getStudent();

		/**
		 * The meta object literal for the '<em><b>Matrikelnummer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDENT__MATRIKELNUMMER = eINSTANCE.getStudent_Matrikelnummer();

		/**
		 * The meta object literal for the '<em><b>Semester</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDENT__SEMESTER = eINSTANCE.getStudent_Semester();

		/**
		 * The meta object literal for the '{@link universitaet.impl.VorlesungImpl <em>Vorlesung</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universitaet.impl.VorlesungImpl
		 * @see universitaet.impl.UniversitaetPackageImpl#getVorlesung()
		 * @generated
		 */
		EClass VORLESUNG = eINSTANCE.getVorlesung();

		/**
		 * The meta object literal for the '<em><b>Vorlesung Kennung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VORLESUNG__VORLESUNG_KENNUNG = eINSTANCE.getVorlesung_VorlesungKennung();

		/**
		 * The meta object literal for the '<em><b>Mitarbeiter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VORLESUNG__MITARBEITER = eINSTANCE.getVorlesung_Mitarbeiter();

		/**
		 * The meta object literal for the '<em><b>Studenten</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VORLESUNG__STUDENTEN = eINSTANCE.getVorlesung_Studenten();

		/**
		 * The meta object literal for the '<em><b>Raum</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VORLESUNG__RAUM = eINSTANCE.getVorlesung_Raum();

		/**
		 * The meta object literal for the '{@link universitaet.impl.GebaeudeImpl <em>Gebaeude</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universitaet.impl.GebaeudeImpl
		 * @see universitaet.impl.UniversitaetPackageImpl#getGebaeude()
		 * @generated
		 */
		EClass GEBAEUDE = eINSTANCE.getGebaeude();

		/**
		 * The meta object literal for the '<em><b>Gebaeude Kennung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEBAEUDE__GEBAEUDE_KENNUNG = eINSTANCE.getGebaeude_GebaeudeKennung();

		/**
		 * The meta object literal for the '<em><b>Raeume</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEBAEUDE__RAEUME = eINSTANCE.getGebaeude_Raeume();

		/**
		 * The meta object literal for the '{@link universitaet.impl.RaumImpl <em>Raum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universitaet.impl.RaumImpl
		 * @see universitaet.impl.UniversitaetPackageImpl#getRaum()
		 * @generated
		 */
		EClass RAUM = eINSTANCE.getRaum();

		/**
		 * The meta object literal for the '<em><b>Raum Kennung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RAUM__RAUM_KENNUNG = eINSTANCE.getRaum_RaumKennung();

		/**
		 * The meta object literal for the '<em><b>Vorlesungen</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAUM__VORLESUNGEN = eINSTANCE.getRaum_Vorlesungen();

		/**
		 * The meta object literal for the '{@link universitaet.Arbeitsverhaeltnis <em>Arbeitsverhaeltnis</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universitaet.Arbeitsverhaeltnis
		 * @see universitaet.impl.UniversitaetPackageImpl#getArbeitsverhaeltnis()
		 * @generated
		 */
		EEnum ARBEITSVERHAELTNIS = eINSTANCE.getArbeitsverhaeltnis();

	}

} //UniversitaetPackage
