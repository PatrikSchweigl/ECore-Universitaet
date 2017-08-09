/**
 */
package universitaet.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import universitaet.Student;
import universitaet.UniversitaetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link universitaet.impl.StudentImpl#getMatrikelnummer <em>Matrikelnummer</em>}</li>
 *   <li>{@link universitaet.impl.StudentImpl#getSemester <em>Semester</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StudentImpl extends UserImpl implements Student {
	/**
	 * The default value of the '{@link #getMatrikelnummer() <em>Matrikelnummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatrikelnummer()
	 * @generated
	 * @ordered
	 */
	protected static final String MATRIKELNUMMER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMatrikelnummer() <em>Matrikelnummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatrikelnummer()
	 * @generated
	 * @ordered
	 */
	protected String matrikelnummer = MATRIKELNUMMER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSemester() <em>Semester</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemester()
	 * @generated
	 * @ordered
	 */
	protected static final int SEMESTER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSemester() <em>Semester</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemester()
	 * @generated
	 * @ordered
	 */
	protected int semester = SEMESTER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UniversitaetPackage.Literals.STUDENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMatrikelnummer() {
		return matrikelnummer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatrikelnummer(String newMatrikelnummer) {
		String oldMatrikelnummer = matrikelnummer;
		matrikelnummer = newMatrikelnummer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversitaetPackage.STUDENT__MATRIKELNUMMER,
					oldMatrikelnummer, matrikelnummer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSemester() {
		return semester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSemester(int newSemester) {
		int oldSemester = semester;
		semester = newSemester;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversitaetPackage.STUDENT__SEMESTER, oldSemester,
					semester));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UniversitaetPackage.STUDENT__MATRIKELNUMMER:
			return getMatrikelnummer();
		case UniversitaetPackage.STUDENT__SEMESTER:
			return getSemester();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case UniversitaetPackage.STUDENT__MATRIKELNUMMER:
			setMatrikelnummer((String) newValue);
			return;
		case UniversitaetPackage.STUDENT__SEMESTER:
			setSemester((Integer) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case UniversitaetPackage.STUDENT__MATRIKELNUMMER:
			setMatrikelnummer(MATRIKELNUMMER_EDEFAULT);
			return;
		case UniversitaetPackage.STUDENT__SEMESTER:
			setSemester(SEMESTER_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case UniversitaetPackage.STUDENT__MATRIKELNUMMER:
			return MATRIKELNUMMER_EDEFAULT == null ? matrikelnummer != null
					: !MATRIKELNUMMER_EDEFAULT.equals(matrikelnummer);
		case UniversitaetPackage.STUDENT__SEMESTER:
			return semester != SEMESTER_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Matrikelnummer: ");
		result.append(matrikelnummer);
		result.append(", Semester: ");
		result.append(semester);
		result.append(')');
		return result.toString();
	}

} //StudentImpl
