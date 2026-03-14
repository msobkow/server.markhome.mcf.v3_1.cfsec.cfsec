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

public interface ICFSecSecGrpIncTableObj
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
	 *	Instantiate a new SecGrpInc instance.
	 *
	 *	@return	A new instance.
	 */
	ICFSecSecGrpIncObj newInstance();

	/**
	 *	Instantiate a new SecGrpInc edition of the specified SecGrpInc instance.
	 *
	 *	@return	A new edition.
	 */
	ICFSecSecGrpIncEditObj newEditInstance( ICFSecSecGrpIncObj orig );

	/**
	 *	Internal use only.
	 */
	ICFSecSecGrpIncObj realiseSecGrpInc( ICFSecSecGrpIncObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFSecSecGrpIncObj createSecGrpInc( ICFSecSecGrpIncObj Obj );

	/**
	 *	Read a SecGrpInc-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecGrpInc-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFSecSecGrpIncObj readSecGrpInc( CFLibDbKeyHash256 pkey );

	/**
	 *	Read a SecGrpInc-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecGrpInc-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFSecSecGrpIncObj readSecGrpInc( CFLibDbKeyHash256 pkey,
		boolean forceRead );

	ICFSecSecGrpIncObj readCachedSecGrpInc( CFLibDbKeyHash256 pkey );

	public void reallyDeepDisposeSecGrpInc( ICFSecSecGrpIncObj obj );

	void deepDisposeSecGrpInc( CFLibDbKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	ICFSecSecGrpIncObj lockSecGrpInc( CFLibDbKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the SecGrpInc-derived instances in the database.
	 *
	 *	@return	List of ICFSecSecGrpIncObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFSecSecGrpIncObj> readAllSecGrpInc();

	/**
	 *	Return a sorted map of all the SecGrpInc-derived instances in the database.
	 *
	 *	@return	List of ICFSecSecGrpIncObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFSecSecGrpIncObj> readAllSecGrpInc( boolean forceRead );

	List<ICFSecSecGrpIncObj> readCachedAllSecGrpInc();

	/**
	 *	Return a sorted map of a page of the SecGrpInc-derived instances in the database.
	 *
	 *	@return	List of ICFSecSecGrpIncObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFSecSecGrpIncObj> pageAllSecGrpInc(CFLibDbKeyHash256 priorSecGrpIncId );

	/**
	 *	Get the CFSecSecGrpIncObj instance for the primary key attributes.
	 *
	 *	@param	SecGrpIncId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return	CFSecSecGrpIncObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFSecSecGrpIncObj readSecGrpIncByIdIdx( CFLibDbKeyHash256 SecGrpIncId );

	/**
	 *	Get the CFSecSecGrpIncObj instance for the primary key attributes.
	 *
	 *	@param	SecGrpIncId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return	CFSecSecGrpIncObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFSecSecGrpIncObj readSecGrpIncByIdIdx( CFLibDbKeyHash256 SecGrpIncId,
		boolean forceRead );

	/**
	 *	Get the map of CFSecSecGrpIncObj instances sorted by their primary keys for the duplicate ClusterIdx key.
	 *
	 *	@param	ClusterId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return	List of CFSecSecGrpIncObj cached instances sorted by their primary keys for the duplicate ClusterIdx key,
	 *		which may be an empty set.
	 */
	List<ICFSecSecGrpIncObj> readSecGrpIncByClusterIdx( CFLibDbKeyHash256 ClusterId );

	/**
	 *	Get the map of CFSecSecGrpIncObj instances sorted by their primary keys for the duplicate ClusterIdx key.
	 *
	 *	@param	ClusterId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return	List of CFSecSecGrpIncObj cached instances sorted by their primary keys for the duplicate ClusterIdx key,
	 *		which may be an empty set.
	 */
	List<ICFSecSecGrpIncObj> readSecGrpIncByClusterIdx( CFLibDbKeyHash256 ClusterId,
		boolean forceRead );

	/**
	 *	Get the map of CFSecSecGrpIncObj instances sorted by their primary keys for the duplicate GroupIdx key.
	 *
	 *	@param	SecGroupId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return	List of CFSecSecGrpIncObj cached instances sorted by their primary keys for the duplicate GroupIdx key,
	 *		which may be an empty set.
	 */
	List<ICFSecSecGrpIncObj> readSecGrpIncByGroupIdx( CFLibDbKeyHash256 SecGroupId );

	/**
	 *	Get the map of CFSecSecGrpIncObj instances sorted by their primary keys for the duplicate GroupIdx key.
	 *
	 *	@param	SecGroupId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return	List of CFSecSecGrpIncObj cached instances sorted by their primary keys for the duplicate GroupIdx key,
	 *		which may be an empty set.
	 */
	List<ICFSecSecGrpIncObj> readSecGrpIncByGroupIdx( CFLibDbKeyHash256 SecGroupId,
		boolean forceRead );

	/**
	 *	Get the map of CFSecSecGrpIncObj instances sorted by their primary keys for the duplicate IncludeIdx key.
	 *
	 *	@param	IncludeGroupId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return	List of CFSecSecGrpIncObj cached instances sorted by their primary keys for the duplicate IncludeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFSecSecGrpIncObj> readSecGrpIncByIncludeIdx( CFLibDbKeyHash256 IncludeGroupId );

	/**
	 *	Get the map of CFSecSecGrpIncObj instances sorted by their primary keys for the duplicate IncludeIdx key.
	 *
	 *	@param	IncludeGroupId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return	List of CFSecSecGrpIncObj cached instances sorted by their primary keys for the duplicate IncludeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFSecSecGrpIncObj> readSecGrpIncByIncludeIdx( CFLibDbKeyHash256 IncludeGroupId,
		boolean forceRead );

	/**
	 *	Get the CFSecSecGrpIncObj instance for the unique UIncludeIdx key.
	 *
	 *	@param	ClusterId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	SecGroupId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	IncludeGroupId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return	CFSecSecGrpIncObj cached instance for the unique UIncludeIdx key, or
	 *		null if no such instance exists.
	 */
	ICFSecSecGrpIncObj readSecGrpIncByUIncludeIdx(CFLibDbKeyHash256 ClusterId,
		CFLibDbKeyHash256 SecGroupId,
		CFLibDbKeyHash256 IncludeGroupId );

	/**
	 *	Get the CFSecSecGrpIncObj instance for the unique UIncludeIdx key.
	 *
	 *	@param	ClusterId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	SecGroupId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	IncludeGroupId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return	CFSecSecGrpIncObj refreshed instance for the unique UIncludeIdx key, or
	 *		null if no such instance exists.
	 */
	ICFSecSecGrpIncObj readSecGrpIncByUIncludeIdx(CFLibDbKeyHash256 ClusterId,
		CFLibDbKeyHash256 SecGroupId,
		CFLibDbKeyHash256 IncludeGroupId,
		boolean forceRead );

	ICFSecSecGrpIncObj readCachedSecGrpIncByIdIdx( CFLibDbKeyHash256 SecGrpIncId );

	List<ICFSecSecGrpIncObj> readCachedSecGrpIncByClusterIdx( CFLibDbKeyHash256 ClusterId );

	List<ICFSecSecGrpIncObj> readCachedSecGrpIncByGroupIdx( CFLibDbKeyHash256 SecGroupId );

	List<ICFSecSecGrpIncObj> readCachedSecGrpIncByIncludeIdx( CFLibDbKeyHash256 IncludeGroupId );

	ICFSecSecGrpIncObj readCachedSecGrpIncByUIncludeIdx( CFLibDbKeyHash256 ClusterId,
		CFLibDbKeyHash256 SecGroupId,
		CFLibDbKeyHash256 IncludeGroupId );

	void deepDisposeSecGrpIncByIdIdx( CFLibDbKeyHash256 SecGrpIncId );

	void deepDisposeSecGrpIncByClusterIdx( CFLibDbKeyHash256 ClusterId );

	void deepDisposeSecGrpIncByGroupIdx( CFLibDbKeyHash256 SecGroupId );

	void deepDisposeSecGrpIncByIncludeIdx( CFLibDbKeyHash256 IncludeGroupId );

	void deepDisposeSecGrpIncByUIncludeIdx( CFLibDbKeyHash256 ClusterId,
		CFLibDbKeyHash256 SecGroupId,
		CFLibDbKeyHash256 IncludeGroupId );

	/**
	 *	Read a page of data as a List of SecGrpInc-derived instances sorted by their primary keys,
	 *	as identified by the duplicate ClusterIdx key attributes.
	 *
	 *	@param	ClusterId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return	A List of SecGrpInc-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	List<ICFSecSecGrpIncObj> pageSecGrpIncByClusterIdx( CFLibDbKeyHash256 ClusterId,
		CFLibDbKeyHash256 priorSecGrpIncId );

	/**
	 *	Read a page of data as a List of SecGrpInc-derived instances sorted by their primary keys,
	 *	as identified by the duplicate GroupIdx key attributes.
	 *
	 *	@param	SecGroupId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return	A List of SecGrpInc-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	List<ICFSecSecGrpIncObj> pageSecGrpIncByGroupIdx( CFLibDbKeyHash256 SecGroupId,
		CFLibDbKeyHash256 priorSecGrpIncId );

	/**
	 *	Read a page of data as a List of SecGrpInc-derived instances sorted by their primary keys,
	 *	as identified by the duplicate IncludeIdx key attributes.
	 *
	 *	@param	IncludeGroupId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return	A List of SecGrpInc-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	List<ICFSecSecGrpIncObj> pageSecGrpIncByIncludeIdx( CFLibDbKeyHash256 IncludeGroupId,
		CFLibDbKeyHash256 priorSecGrpIncId );

	/**
	 *	Internal use only.
	 */
	ICFSecSecGrpIncObj updateSecGrpInc( ICFSecSecGrpIncObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteSecGrpInc( ICFSecSecGrpIncObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	SecGrpIncId	The SecGrpInc key attribute of the instance generating the id.
	 */
	void deleteSecGrpIncByIdIdx( CFLibDbKeyHash256 SecGrpIncId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ClusterId	The SecGrpInc key attribute of the instance generating the id.
	 */
	void deleteSecGrpIncByClusterIdx( CFLibDbKeyHash256 ClusterId );

	/**
	 *	Internal use only.
	 *
	 *	@param	SecGroupId	The SecGrpInc key attribute of the instance generating the id.
	 */
	void deleteSecGrpIncByGroupIdx( CFLibDbKeyHash256 SecGroupId );

	/**
	 *	Internal use only.
	 *
	 *	@param	IncludeGroupId	The SecGrpInc key attribute of the instance generating the id.
	 */
	void deleteSecGrpIncByIncludeIdx( CFLibDbKeyHash256 IncludeGroupId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ClusterId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	SecGroupId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	IncludeGroupId	The SecGrpInc key attribute of the instance generating the id.
	 */
	void deleteSecGrpIncByUIncludeIdx(CFLibDbKeyHash256 ClusterId,
		CFLibDbKeyHash256 SecGroupId,
		CFLibDbKeyHash256 IncludeGroupId );
}
