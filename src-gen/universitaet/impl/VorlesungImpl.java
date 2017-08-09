/**
 */
package universitaet.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import universitaet.Mitarbeiter;
import universitaet.Raum;
import universitaet.Student;
import universitaet.UniversitaetPackage;
import universitaet.Vorlesung;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vorlesung</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link universitaet.impl.VorlesungImpl#getVorlesungKennung <em>Vorlesung Kennung</em>}</li>
 *   <li>{@link universitaet.impl.VorlesungImpl#getMitarbeiter <em>Mitarbeiter</em>}</li>
 *   <li>{@link universitaet.impl.VorlesungImpl#getStudenten <em>Studenten</em>}</li>
 *   <li>{@link universitaet.impl.VorlesungImpl#getRaum <em>Raum</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VorlesungImpl extends EntityImpl implements Vorlesung {
	/**
	 * The default value of the '{@link #getVorlesungKennung() <em>Vorlesung Kennung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVorlesungKennung()
	 * @generated
	 * @ordered
	 */
	protected static final String VORLESUNG_KENNUNG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVorlesungKennung() <em>Vorlesung Kennung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVorlesungKennung()
	 * @generated
	 * @ordered
	 */
	protected String vorlesungKennung = VORLESUNG_KENNUNG_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMitarbeiter() <em>Mitarbeiter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMitarbeiter()
	 * @generated
	 * @ordered
	 */
	protected Mitarbeiter mitarbeiter;

	/**
	 * The cached value of the '{@link #getStudenten() <em>Studenten</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudenten()
	 * @generated
	 * @ordered
	 */
	protected EList<Student> studenten;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VorlesungImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UniversitaetPackage.Literals.VORLESUNG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVorlesungKennung() {
		return vorlesungKennung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVorlesungKennung(String newVorlesungKennung) {
		String oldVorlesungKennung = vorlesungKennung;
		vorlesungKennung = newVorlesungKennung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversitaetPackage.VORLESUNG__VORLESUNG_KENNUNG,
					oldVorlesungKennung, vorlesungKennung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mitarbeiter getMitarbeiter() {
		if (mitarbeiter != null && mitarbeiter.eIsProxy()) {
			InternalEObject oldMitarbeiter = (InternalEObject) mitarbeiter;
			mitarbeiter = (Mitarbeiter) eResolveProxy(oldMitarbeiter);
			if (mitarbeiter != oldMitarbeiter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							UniversitaetPackage.VORLESUNG__MITARBEITER, oldMitarbeiter, mitarbeiter));
			}
		}
		return mitarbeiter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mitarbeiter basicGetMitarbeiter() {
		return mitarbeiter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMitarbeiter(Mitarbeiter newMitarbeiter) {
		Mitarbeiter oldMitarbeiter = mitarbeiter;
		mitarbeiter = newMitarbeiter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversitaetPackage.VORLESUNG__MITARBEITER,
					oldMitarbeiter, mitarbeiter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Student> getStudenten() {
		if (studenten == null) {
			studenten = new EObjectResolvingEList<Student>(Student.class, this,
					UniversitaetPackage.VORLESUNG__STUDENTEN);
		}
		return studenten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Raum getRaum() {
		if (eContainerFeatureID() != UniversitaetPackage.VORLESUNG__RAUM)
			return null;
		return (Raum) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRaum(Raum newRaum, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newRaum, UniversitaetPackage.VORLESUNG__RAUM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRaum(Raum newRaum) {
		if (newRaum != eInternalContainer()
				|| (eContainerFeatureID() != UniversitaetPackage.VORLESUNG__RAUM && newRaum != null)) {
			if (EcoreUtil.isAncestor(this, newRaum))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRaum != null)
				msgs = ((InternalEObject) newRaum).eInverseAdd(this, UniversitaetPackage.RAUM__VORLESUNGEN, Raum.class,
						msgs);
			msgs = basicSetRaum(newRaum, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversitaetPackage.VORLESUNG__RAUM, newRaum,
					newRaum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UniversitaetPackage.VORLESUNG__RAUM:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetRaum((Raum) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UniversitaetPackage.VORLESUNG__RAUM:
			return basicSetRaum(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case UniversitaetPackage.VORLESUNG__RAUM:
			return eInternalContainer().eInverseRemove(this, UniversitaetPackage.RAUM__VORLESUNGEN, Raum.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UniversitaetPackage.VORLESUNG__VORLESUNG_KENNUNG:
			return getVorlesungKennung();
		case UniversitaetPackage.VORLESUNG__MITARBEITER:
			if (resolve)
				return getMitarbeiter();
			return basicGetMitarbeiter();
		case UniversitaetPackage.VORLESUNG__STUDENTEN:
			return getStudenten();
		case UniversitaetPackage.VORLESUNG__RAUM:
			return getRaum();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case UniversitaetPackage.VORLESUNG__VORLESUNG_KENNUNG:
			setVorlesungKennung((String) newValue);
			return;
		case UniversitaetPackage.VORLESUNG__MITARBEITER:
			setMitarbeiter((Mitarbeiter) newValue);
			return;
		case UniversitaetPackage.VORLESUNG__STUDENTEN:
			getStudenten().clear();
			getStudenten().addAll((Collection<? extends Student>) newValue);
			return;
		case UniversitaetPackage.VORLESUNG__RAUM:
			setRaum((Raum) newValue);
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
		case UniversitaetPackage.VORLESUNG__VORLESUNG_KENNUNG:
			setVorlesungKennung(VORLESUNG_KENNUNG_EDEFAULT);
			return;
		case UniversitaetPackage.VORLESUNG__MITARBEITER:
			setMitarbeiter((Mitarbeiter) null);
			return;
		case UniversitaetPackage.VORLESUNG__STUDENTEN:
			getStudenten().clear();
			return;
		case UniversitaetPackage.VORLESUNG__RAUM:
			setRaum((Raum) null);
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
		case UniversitaetPackage.VORLESUNG__VORLESUNG_KENNUNG:
			return VORLESUNG_KENNUNG_EDEFAULT == null ? vorlesungKennung != null
					: !VORLESUNG_KENNUNG_EDEFAULT.equals(vorlesungKennung);
		case UniversitaetPackage.VORLESUNG__MITARBEITER:
			return mitarbeiter != null;
		case UniversitaetPackage.VORLESUNG__STUDENTEN:
			return studenten != null && !studenten.isEmpty();
		case UniversitaetPackage.VORLESUNG__RAUM:
			return getRaum() != null;
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
		result.append(" (VorlesungKennung: ");
		result.append(vorlesungKennung);
		result.append(')');
		return result.toString();
	}

} //VorlesungImpl
