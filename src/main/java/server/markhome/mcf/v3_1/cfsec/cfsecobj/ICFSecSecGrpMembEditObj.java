// Description: Java 25 Instance Edit Object interface for CFSec SecGrpMemb.

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
import server.markhome.mcf.v3_1.cflib.dbutil.*;import org.apache.commons.text.StringEscapeUtils;
import server.markhome.mcf.v3_1.cfsec.cfsec.*;

public interface ICFSecSecGrpMembEditObj
	extends ICFSecSecGrpMembObj
{
	/*
	 *	Get the original for this edition as the base type for the class hierarchy.
	 *
	 *	@return The original, non-modifiable instance as a base ICFSecSecGrpMembObj.
	 */
	ICFSecSecGrpMembObj getOrig();

	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a ICFSecSecGrpMembObj.
	 */
	ICFSecSecGrpMembObj getOrigAsSecGrpMemb();

	/*
	 *	create() may return a different instance than the
	 *	one used to invoke the operation.  All future references
	 *	should be to the returned instance, not the original
	 *	invoker.  You should lose all references to the original
	 *	invoker.
	 *
	 *	@return The created instance.
	 */
	ICFSecSecGrpMembObj create();

	/*
	 *	Update the instance.
	 */
	CFSecSecGrpMembEditObj update();

	/*
	 *	Delete the instance.
	 */
	CFSecSecGrpMembEditObj deleteInstance();

	/**
	 *	Set the user who created this instance.
	 *
	 *	@param	value	The ICFSecSecUserObj instance who created this instance.
	 */
	void setCreatedBy( ICFSecSecUserObj value );

	/**
	 *	Set the Calendar date-time this instance was created.
	 *
	 *	@param	value	The Calendar value for the create time of the instance.
	 */
	void setCreatedAt( LocalDateTime value );

	/**
	 *	Set the user who updated this instance.
	 *
	 *	@param	value	The ICFSecSecUserObj instance who updated this instance.
	 */
	void setUpdatedBy( ICFSecSecUserObj value );

	/**
	 *	Set the Calendar date-time this instance was updated.
	 *
	 *	@param	value	The Calendar value for the create time of the instance.
	 */
	void setUpdatedAt( LocalDateTime value );

	/**
	 *	Get the ICFSecClusterObj instance referenced by the Cluster key.
	 *
	 *	@return	The ICFSecClusterObj instance referenced by the Cluster key.
	 */
	ICFSecClusterObj getRequiredOwnerCluster();

	/**
	 *	Set the ICFSecClusterObj instance referenced by the Cluster key.
	 *
	 *	@param	value	the ICFSecClusterObj instance to be referenced by the Cluster key.
	 */
	void setRequiredOwnerCluster( ICFSecClusterObj value );

	/**
	 *	Get the ICFSecSecGroupObj instance referenced by the Group key.
	 *
	 *	@return	The ICFSecSecGroupObj instance referenced by the Group key.
	 */
	ICFSecSecGroupObj getRequiredContainerGroup();

	/**
	 *	Set the ICFSecSecGroupObj instance referenced by the Group key.
	 *
	 *	@param	value	the ICFSecSecGroupObj instance to be referenced by the Group key.
	 */
	void setRequiredContainerGroup( ICFSecSecGroupObj value );

	/**
	 *	Get the ICFSecSecUserObj instance referenced by the User key.
	 *
	 *	@return	The ICFSecSecUserObj instance referenced by the User key.
	 */
	ICFSecSecUserObj getRequiredParentUser();

	/**
	 *	Set the ICFSecSecUserObj instance referenced by the User key.
	 *
	 *	@param	value	the ICFSecSecUserObj instance to be referenced by the User key.
	 */
	void setRequiredParentUser( ICFSecSecUserObj value );

	/**
	 *	Get the required CFLibDbKeyHash256 attribute SecGrpMembId.
	 *
	 *	@return	The required CFLibDbKeyHash256 attribute SecGrpMembId.
	 */
	CFLibDbKeyHash256 getRequiredSecGrpMembId();

	/**
	 *	Set the required CFLibDbKeyHash256 attribute SecGrpMembId.
	 *
	 *	@param value The required CFLibDbKeyHash256 attribute SecGrpMembId value to be applied.
	 */
	void setRequiredSecGrpMembId(CFLibDbKeyHash256 value);

	/**
	 *	Get the required CFLibDbKeyHash256 attribute ClusterId.
	 *
	 *	@return	The required CFLibDbKeyHash256 attribute ClusterId.
	 */
	CFLibDbKeyHash256 getRequiredClusterId();

	/**
	 *	Get the required CFLibDbKeyHash256 attribute SecGroupId.
	 *
	 *	@return	The required CFLibDbKeyHash256 attribute SecGroupId.
	 */
	CFLibDbKeyHash256 getRequiredSecGroupId();

	/**
	 *	Get the required CFLibDbKeyHash256 attribute SecUserId.
	 *
	 *	@return	The required CFLibDbKeyHash256 attribute SecUserId.
	 */
	CFLibDbKeyHash256 getRequiredSecUserId();

	public void copyRecToOrig();
	public void copyOrigToRec();

}
