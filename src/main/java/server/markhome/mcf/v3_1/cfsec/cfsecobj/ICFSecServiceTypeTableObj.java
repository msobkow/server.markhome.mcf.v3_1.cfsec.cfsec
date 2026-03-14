// Description: Java 25 Table Object interface for CFSec.

/*
 *	server.markhome.mcf.CFSec
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal 3.1 CFSec - Security Services
 *	
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow mark.sobkow@gmail.com
 *	
 *	These files are part of Mark's Code Fractal CFSec.
 *	
 *	Licensed under the Apache License, Version 2.0 (the "License");
 *	you may not use this file except in compliance with the License.
 *	You may obtain a copy of the License at
 *	
 *	http://www.apache.org/licenses/LICENSE-2.0
 *	
 *	Unless required by applicable law or agreed to in writing, software
 *	distributed under the License is distributed on an "AS IS" BASIS,
 *	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *	See the License for the specific language governing permissions and
 *	limitations under the License.
 *	
 */

package server.markhome.mcf.v3_1.cfsec.cfsecobj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.time.*;
import java.util.*;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.text.StringEscapeUtils;
import server.markhome.mcf.v3_1.cflib.*;
import server.markhome.mcf.v3_1.cflib.dbutil.*;
import server.markhome.mcf.v3_1.cfsec.cfsec.*;

public interface ICFSecServiceTypeTableObj
{
	public ICFSecSchemaObj getSchema();
	public void setSchema( ICFSecSchemaObj value );

	public void minimizeMemory();

	public String getTableName();
	public String getTableDbName();

	/**
	 *	Get class code always returns the runtime class code for the objects, which is not stable until the application is done initializing and registering its objects.
	 *
	 *	@return runtime classcode
	 */ 
	public int getClassCode();

	/**
	 *	Get the backing store schema's class code, which is hard-coded into the object hierarchy.
	 *
	 *	@return The hardcoded backing store class code for this object, which is only valid in that schema.
	 */
	// public static int getBackingClassCode();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new ServiceType instance.
	 *
	 *	@return	A new instance.
	 */
	ICFSecServiceTypeObj newInstance();

	/**
	 *	Instantiate a new ServiceType edition of the specified ServiceType instance.
	 *
	 *	@return	A new edition.
	 */
	ICFSecServiceTypeEditObj newEditInstance( ICFSecServiceTypeObj orig );

	/**
	 *	Internal use only.
	 */
	ICFSecServiceTypeObj realiseServiceType( ICFSecServiceTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFSecServiceTypeObj createServiceType( ICFSecServiceTypeObj Obj );

	/**
	 *	Read a ServiceType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ServiceType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFSecServiceTypeObj readServiceType( CFLibDbKeyHash256 pkey );

	/**
	 *	Read a ServiceType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ServiceType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFSecServiceTypeObj readServiceType( CFLibDbKeyHash256 pkey,
		boolean forceRead );

	ICFSecServiceTypeObj readCachedServiceType( CFLibDbKeyHash256 pkey );

	public void reallyDeepDisposeServiceType( ICFSecServiceTypeObj obj );

	void deepDisposeServiceType( CFLibDbKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	ICFSecServiceTypeObj lockServiceType( CFLibDbKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the ServiceType-derived instances in the database.
	 *
	 *	@return	List of ICFSecServiceTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFSecServiceTypeObj> readAllServiceType();

	/**
	 *	Return a sorted map of all the ServiceType-derived instances in the database.
	 *
	 *	@return	List of ICFSecServiceTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFSecServiceTypeObj> readAllServiceType( boolean forceRead );

	List<ICFSecServiceTypeObj> readCachedAllServiceType();

	/**
	 *	Get the CFSecServiceTypeObj instance for the primary key attributes.
	 *
	 *	@param	ServiceTypeId	The ServiceType key attribute of the instance generating the id.
	 *
	 *	@return	CFSecServiceTypeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFSecServiceTypeObj readServiceTypeByIdIdx( CFLibDbKeyHash256 ServiceTypeId );

	/**
	 *	Get the CFSecServiceTypeObj instance for the primary key attributes.
	 *
	 *	@param	ServiceTypeId	The ServiceType key attribute of the instance generating the id.
	 *
	 *	@return	CFSecServiceTypeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFSecServiceTypeObj readServiceTypeByIdIdx( CFLibDbKeyHash256 ServiceTypeId,
		boolean forceRead );

	/**
	 *	Get the CFSecServiceTypeObj instance for the unique UDescrIdx key.
	 *
	 *	@param	Description	The ServiceType key attribute of the instance generating the id.
	 *
	 *	@return	CFSecServiceTypeObj cached instance for the unique UDescrIdx key, or
	 *		null if no such instance exists.
	 */
	ICFSecServiceTypeObj readServiceTypeByUDescrIdx(String Description );

	/**
	 *	Get the CFSecServiceTypeObj instance for the unique UDescrIdx key.
	 *
	 *	@param	Description	The ServiceType key attribute of the instance generating the id.
	 *
	 *	@return	CFSecServiceTypeObj refreshed instance for the unique UDescrIdx key, or
	 *		null if no such instance exists.
	 */
	ICFSecServiceTypeObj readServiceTypeByUDescrIdx(String Description,
		boolean forceRead );

	ICFSecServiceTypeObj readCachedServiceTypeByIdIdx( CFLibDbKeyHash256 ServiceTypeId );

	ICFSecServiceTypeObj readCachedServiceTypeByUDescrIdx( String Description );

	void deepDisposeServiceTypeByIdIdx( CFLibDbKeyHash256 ServiceTypeId );

	void deepDisposeServiceTypeByUDescrIdx( String Description );

	/**
	 *	Internal use only.
	 */
	ICFSecServiceTypeObj updateServiceType( ICFSecServiceTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteServiceType( ICFSecServiceTypeObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	ServiceTypeId	The ServiceType key attribute of the instance generating the id.
	 */
	void deleteServiceTypeByIdIdx( CFLibDbKeyHash256 ServiceTypeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	Description	The ServiceType key attribute of the instance generating the id.
	 */
	void deleteServiceTypeByUDescrIdx(String Description );
}
