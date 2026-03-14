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

public interface ICFSecSecGroupTableObj
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
	 *	Instantiate a new SecGroup instance.
	 *
	 *	@return	A new instance.
	 */
	ICFSecSecGroupObj newInstance();

	/**
	 *	Instantiate a new SecGroup edition of the specified SecGroup instance.
	 *
	 *	@return	A new edition.
	 */
	ICFSecSecGroupEditObj newEditInstance( ICFSecSecGroupObj orig );

	/**
	 *	Internal use only.
	 */
	ICFSecSecGroupObj realiseSecGroup( ICFSecSecGroupObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFSecSecGroupObj createSecGroup( ICFSecSecGroupObj Obj );

	/**
	 *	Read a SecGroup-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecGroup-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFSecSecGroupObj readSecGroup( CFLibDbKeyHash256 pkey );

	/**
	 *	Read a SecGroup-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecGroup-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFSecSecGroupObj readSecGroup( CFLibDbKeyHash256 pkey,
		boolean forceRead );

	ICFSecSecGroupObj readCachedSecGroup( CFLibDbKeyHash256 pkey );

	public void reallyDeepDisposeSecGroup( ICFSecSecGroupObj obj );

	void deepDisposeSecGroup( CFLibDbKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	ICFSecSecGroupObj lockSecGroup( CFLibDbKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the SecGroup-derived instances in the database.
	 *
	 *	@return	List of ICFSecSecGroupObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFSecSecGroupObj> readAllSecGroup();

	/**
	 *	Return a sorted map of all the SecGroup-derived instances in the database.
	 *
	 *	@return	List of ICFSecSecGroupObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFSecSecGroupObj> readAllSecGroup( boolean forceRead );

	List<ICFSecSecGroupObj> readCachedAllSecGroup();

	/**
	 *	Get the CFSecSecGroupObj instance for the primary key attributes.
	 *
	 *	@param	SecGroupId	The SecGroup key attribute of the instance generating the id.
	 *
	 *	@return	CFSecSecGroupObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFSecSecGroupObj readSecGroupByIdIdx( CFLibDbKeyHash256 SecGroupId );

	/**
	 *	Get the CFSecSecGroupObj instance for the primary key attributes.
	 *
	 *	@param	SecGroupId	The SecGroup key attribute of the instance generating the id.
	 *
	 *	@return	CFSecSecGroupObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFSecSecGroupObj readSecGroupByIdIdx( CFLibDbKeyHash256 SecGroupId,
		boolean forceRead );

	/**
	 *	Get the map of CFSecSecGroupObj instances sorted by their primary keys for the duplicate ClusterIdx key.
	 *
	 *	@param	ClusterId	The SecGroup key attribute of the instance generating the id.
	 *
	 *	@return	List of CFSecSecGroupObj cached instances sorted by their primary keys for the duplicate ClusterIdx key,
	 *		which may be an empty set.
	 */
	List<ICFSecSecGroupObj> readSecGroupByClusterIdx( CFLibDbKeyHash256 ClusterId );

	/**
	 *	Get the map of CFSecSecGroupObj instances sorted by their primary keys for the duplicate ClusterIdx key.
	 *
	 *	@param	ClusterId	The SecGroup key attribute of the instance generating the id.
	 *
	 *	@return	List of CFSecSecGroupObj cached instances sorted by their primary keys for the duplicate ClusterIdx key,
	 *		which may be an empty set.
	 */
	List<ICFSecSecGroupObj> readSecGroupByClusterIdx( CFLibDbKeyHash256 ClusterId,
		boolean forceRead );

	/**
	 *	Get the map of CFSecSecGroupObj instances sorted by their primary keys for the duplicate ClusterVisIdx key.
	 *
	 *	@param	ClusterId	The SecGroup key attribute of the instance generating the id.
	 *
	 *	@param	IsVisible	The SecGroup key attribute of the instance generating the id.
	 *
	 *	@return	List of CFSecSecGroupObj cached instances sorted by their primary keys for the duplicate ClusterVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFSecSecGroupObj> readSecGroupByClusterVisIdx( CFLibDbKeyHash256 ClusterId,
		boolean IsVisible );

	/**
	 *	Get the map of CFSecSecGroupObj instances sorted by their primary keys for the duplicate ClusterVisIdx key.
	 *
	 *	@param	ClusterId	The SecGroup key attribute of the instance generating the id.
	 *
	 *	@param	IsVisible	The SecGroup key attribute of the instance generating the id.
	 *
	 *	@return	List of CFSecSecGroupObj cached instances sorted by their primary keys for the duplicate ClusterVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFSecSecGroupObj> readSecGroupByClusterVisIdx( CFLibDbKeyHash256 ClusterId,
		boolean IsVisible,
		boolean forceRead );

	/**
	 *	Get the CFSecSecGroupObj instance for the unique UNameIdx key.
	 *
	 *	@param	ClusterId	The SecGroup key attribute of the instance generating the id.
	 *
	 *	@param	Name	The SecGroup key attribute of the instance generating the id.
	 *
	 *	@return	CFSecSecGroupObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFSecSecGroupObj readSecGroupByUNameIdx(CFLibDbKeyHash256 ClusterId,
		String Name );

	/**
	 *	Get the CFSecSecGroupObj instance for the unique UNameIdx key.
	 *
	 *	@param	ClusterId	The SecGroup key attribute of the instance generating the id.
	 *
	 *	@param	Name	The SecGroup key attribute of the instance generating the id.
	 *
	 *	@return	CFSecSecGroupObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFSecSecGroupObj readSecGroupByUNameIdx(CFLibDbKeyHash256 ClusterId,
		String Name,
		boolean forceRead );

	ICFSecSecGroupObj readCachedSecGroupByIdIdx( CFLibDbKeyHash256 SecGroupId );

	List<ICFSecSecGroupObj> readCachedSecGroupByClusterIdx( CFLibDbKeyHash256 ClusterId );

	List<ICFSecSecGroupObj> readCachedSecGroupByClusterVisIdx( CFLibDbKeyHash256 ClusterId,
		boolean IsVisible );

	ICFSecSecGroupObj readCachedSecGroupByUNameIdx( CFLibDbKeyHash256 ClusterId,
		String Name );

	void deepDisposeSecGroupByIdIdx( CFLibDbKeyHash256 SecGroupId );

	void deepDisposeSecGroupByClusterIdx( CFLibDbKeyHash256 ClusterId );

	void deepDisposeSecGroupByClusterVisIdx( CFLibDbKeyHash256 ClusterId,
		boolean IsVisible );

	void deepDisposeSecGroupByUNameIdx( CFLibDbKeyHash256 ClusterId,
		String Name );

	/**
	 *	Internal use only.
	 */
	ICFSecSecGroupObj updateSecGroup( ICFSecSecGroupObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteSecGroup( ICFSecSecGroupObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	SecGroupId	The SecGroup key attribute of the instance generating the id.
	 */
	void deleteSecGroupByIdIdx( CFLibDbKeyHash256 SecGroupId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ClusterId	The SecGroup key attribute of the instance generating the id.
	 */
	void deleteSecGroupByClusterIdx( CFLibDbKeyHash256 ClusterId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ClusterId	The SecGroup key attribute of the instance generating the id.
	 *
	 *	@param	IsVisible	The SecGroup key attribute of the instance generating the id.
	 */
	void deleteSecGroupByClusterVisIdx( CFLibDbKeyHash256 ClusterId,
		boolean IsVisible );

	/**
	 *	Internal use only.
	 *
	 *	@param	ClusterId	The SecGroup key attribute of the instance generating the id.
	 *
	 *	@param	Name	The SecGroup key attribute of the instance generating the id.
	 */
	void deleteSecGroupByUNameIdx(CFLibDbKeyHash256 ClusterId,
		String Name );
}
