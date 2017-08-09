/**
 */
package universitaet.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import universitaet.UniversitaetPackage;
import universitaet.User;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link universitaet.impl.UserImpl#getVorname <em>Vorname</em>}</li>
 *   <li>{@link universitaet.impl.UserImpl#getNachname <em>Nachname</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class UserImpl extends EntityImpl implements User {
	/**
	 * The default value of the '{@link #getVorname() <em>Vorname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVorname()
	 * @generated
	 * @ordered
	 */
	protected static final String VORNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVorname() <em>Vorname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVorname()
	 * @generated
	 * @ordered
	 */
	protected String vorname = VORNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNachname() <em>Nachname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachname()
	 * @generated
	 * @ordered
	 */
	protected static final String NACHNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNachname() <em>Nachname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachname()
	 * @generated
	 * @ordered
	 */
	protected String nachname = NACHNAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UniversitaetPackage.Literals.USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVorname() {
		return vorname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVorname(String newVorname) {
		String oldVorname = vorname;
		vorname = newVorname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversitaetPackage.USER__VORNAME, oldVorname,
					vorname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNachname() {
		return nachname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNachname(String newNachname) {
		String oldNachname = nachname;
		nachname = newNachname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversitaetPackage.USER__NACHNAME, oldNachname,
					nachname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UniversitaetPackage.USER__VORNAME:
			return getVorname();
		case UniversitaetPackage.USER__NACHNAME:
			return getNachname();
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
		case UniversitaetPackage.USER__VORNAME:
			setVorname((String) newValue);
			return;
		case UniversitaetPackage.USER__NACHNAME:
			setNachname((String) newValue);
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
		case UniversitaetPackage.USER__VORNAME:
			setVorname(VORNAME_EDEFAULT);
			return;
		case UniversitaetPackage.USER__NACHNAME:
			setNachname(NACHNAME_EDEFAULT);
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
		case UniversitaetPackage.USER__VORNAME:
			return VORNAME_EDEFAULT == null ? vorname != null : !VORNAME_EDEFAULT.equals(vorname);
		case UniversitaetPackage.USER__NACHNAME:
			return NACHNAME_EDEFAULT == null ? nachname != null : !NACHNAME_EDEFAULT.equals(nachname);
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
		result.append(" (Vorname: ");
		result.append(vorname);
		result.append(", Nachname: ");
		result.append(nachname);
		result.append(')');
		return result.toString();
	}

} //UserImpl
