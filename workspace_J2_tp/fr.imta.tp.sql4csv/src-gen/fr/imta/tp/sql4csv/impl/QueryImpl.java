/**
 */
package fr.imta.tp.sql4csv.impl;

import fr.imta.tp.sql4csv.Column;
import fr.imta.tp.sql4csv.Condition;
import fr.imta.tp.sql4csv.Query;
import fr.imta.tp.sql4csv.Sql4csvPackage;
import fr.imta.tp.sql4csv.Table;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.imta.tp.sql4csv.impl.QueryImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link fr.imta.tp.sql4csv.impl.QueryImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link fr.imta.tp.sql4csv.impl.QueryImpl#getTable <em>Table</em>}</li>
 *   <li>{@link fr.imta.tp.sql4csv.impl.QueryImpl#getTables <em>Tables</em>}</li>
 *   <li>{@link fr.imta.tp.sql4csv.impl.QueryImpl#getConditions <em>Conditions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QueryImpl extends MinimalEObjectImpl.Container implements Query
{
  /**
   * The cached value of the '{@link #getColumn() <em>Column</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumn()
   * @generated
   * @ordered
   */
  protected Column column;

  /**
   * The cached value of the '{@link #getColumns() <em>Columns</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumns()
   * @generated
   * @ordered
   */
  protected EList<Column> columns;

  /**
   * The cached value of the '{@link #getTable() <em>Table</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTable()
   * @generated
   * @ordered
   */
  protected Table table;

  /**
   * The cached value of the '{@link #getTables() <em>Tables</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTables()
   * @generated
   * @ordered
   */
  protected EList<Table> tables;

  /**
   * The cached value of the '{@link #getConditions() <em>Conditions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConditions()
   * @generated
   * @ordered
   */
  protected Condition conditions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QueryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return Sql4csvPackage.Literals.QUERY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Column getColumn()
  {
    return column;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetColumn(Column newColumn, NotificationChain msgs)
  {
    Column oldColumn = column;
    column = newColumn;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Sql4csvPackage.QUERY__COLUMN, oldColumn, newColumn);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColumn(Column newColumn)
  {
    if (newColumn != column)
    {
      NotificationChain msgs = null;
      if (column != null)
        msgs = ((InternalEObject)column).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Sql4csvPackage.QUERY__COLUMN, null, msgs);
      if (newColumn != null)
        msgs = ((InternalEObject)newColumn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Sql4csvPackage.QUERY__COLUMN, null, msgs);
      msgs = basicSetColumn(newColumn, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Sql4csvPackage.QUERY__COLUMN, newColumn, newColumn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Column> getColumns()
  {
    if (columns == null)
    {
      columns = new EObjectContainmentEList<Column>(Column.class, this, Sql4csvPackage.QUERY__COLUMNS);
    }
    return columns;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Table getTable()
  {
    return table;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTable(Table newTable, NotificationChain msgs)
  {
    Table oldTable = table;
    table = newTable;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Sql4csvPackage.QUERY__TABLE, oldTable, newTable);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTable(Table newTable)
  {
    if (newTable != table)
    {
      NotificationChain msgs = null;
      if (table != null)
        msgs = ((InternalEObject)table).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Sql4csvPackage.QUERY__TABLE, null, msgs);
      if (newTable != null)
        msgs = ((InternalEObject)newTable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Sql4csvPackage.QUERY__TABLE, null, msgs);
      msgs = basicSetTable(newTable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Sql4csvPackage.QUERY__TABLE, newTable, newTable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Table> getTables()
  {
    if (tables == null)
    {
      tables = new EObjectContainmentEList<Table>(Table.class, this, Sql4csvPackage.QUERY__TABLES);
    }
    return tables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Condition getConditions()
  {
    return conditions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConditions(Condition newConditions, NotificationChain msgs)
  {
    Condition oldConditions = conditions;
    conditions = newConditions;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Sql4csvPackage.QUERY__CONDITIONS, oldConditions, newConditions);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConditions(Condition newConditions)
  {
    if (newConditions != conditions)
    {
      NotificationChain msgs = null;
      if (conditions != null)
        msgs = ((InternalEObject)conditions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Sql4csvPackage.QUERY__CONDITIONS, null, msgs);
      if (newConditions != null)
        msgs = ((InternalEObject)newConditions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Sql4csvPackage.QUERY__CONDITIONS, null, msgs);
      msgs = basicSetConditions(newConditions, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Sql4csvPackage.QUERY__CONDITIONS, newConditions, newConditions));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case Sql4csvPackage.QUERY__COLUMN:
        return basicSetColumn(null, msgs);
      case Sql4csvPackage.QUERY__COLUMNS:
        return ((InternalEList<?>)getColumns()).basicRemove(otherEnd, msgs);
      case Sql4csvPackage.QUERY__TABLE:
        return basicSetTable(null, msgs);
      case Sql4csvPackage.QUERY__TABLES:
        return ((InternalEList<?>)getTables()).basicRemove(otherEnd, msgs);
      case Sql4csvPackage.QUERY__CONDITIONS:
        return basicSetConditions(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case Sql4csvPackage.QUERY__COLUMN:
        return getColumn();
      case Sql4csvPackage.QUERY__COLUMNS:
        return getColumns();
      case Sql4csvPackage.QUERY__TABLE:
        return getTable();
      case Sql4csvPackage.QUERY__TABLES:
        return getTables();
      case Sql4csvPackage.QUERY__CONDITIONS:
        return getConditions();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case Sql4csvPackage.QUERY__COLUMN:
        setColumn((Column)newValue);
        return;
      case Sql4csvPackage.QUERY__COLUMNS:
        getColumns().clear();
        getColumns().addAll((Collection<? extends Column>)newValue);
        return;
      case Sql4csvPackage.QUERY__TABLE:
        setTable((Table)newValue);
        return;
      case Sql4csvPackage.QUERY__TABLES:
        getTables().clear();
        getTables().addAll((Collection<? extends Table>)newValue);
        return;
      case Sql4csvPackage.QUERY__CONDITIONS:
        setConditions((Condition)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case Sql4csvPackage.QUERY__COLUMN:
        setColumn((Column)null);
        return;
      case Sql4csvPackage.QUERY__COLUMNS:
        getColumns().clear();
        return;
      case Sql4csvPackage.QUERY__TABLE:
        setTable((Table)null);
        return;
      case Sql4csvPackage.QUERY__TABLES:
        getTables().clear();
        return;
      case Sql4csvPackage.QUERY__CONDITIONS:
        setConditions((Condition)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case Sql4csvPackage.QUERY__COLUMN:
        return column != null;
      case Sql4csvPackage.QUERY__COLUMNS:
        return columns != null && !columns.isEmpty();
      case Sql4csvPackage.QUERY__TABLE:
        return table != null;
      case Sql4csvPackage.QUERY__TABLES:
        return tables != null && !tables.isEmpty();
      case Sql4csvPackage.QUERY__CONDITIONS:
        return conditions != null;
    }
    return super.eIsSet(featureID);
  }

} //QueryImpl
