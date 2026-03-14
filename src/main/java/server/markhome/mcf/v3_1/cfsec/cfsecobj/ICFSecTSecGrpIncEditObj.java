// Description: Java 25 Instance Edit Object interface for CFSec TSecGrpInc.

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

public interface ICFSecTSecGrpIncEditObj
	extends ICFSecTSecGrpIncObj
{
	/*
	 *	Get the original for this edition as the base type for the class hierarchy.
	 *
	 *	@return The original, non-modifiable instance as a base ICFSecTSecGrpIncObj.
	 */
	ICFSecTSecGrpIncObj getOrig();

	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a ICFSecTSecGrpIncObj.
	 */
	ICFSecTSecGrpIncObj getOrigAsTSecGrpInc();

	/*
	 *	create() may return a different instance than the
	 *	one used to invoke the operation.  All future references
	 *	should be to the returned instance, not the original
	 *	invoker.  You should lose all references to the original
	 *	invoker.
	 *
	 *	@return The created instance.
	 */
	ICFSecTSecGrpIncObj create();

	/*
	 *	Update the instance.
	 */
	CFSecTSecGrpIncEditObj update();

	/*
	 *	Delete the instance.
	 */
	CFSecTSecGrpIncEditObj deleteInstance();

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
	 *	Get the ICFSecTenantObj instance referenced by the Tenant key.
	 *
	 *	@return	The ICFSecTenantObj instance referenced by the Tenant key.
	 */
	ICFSecTenantObj getRequiredOwnerTenant();

	/**
	 *	Set the ICFSecTenantObj instance referenced by the Tenant key.
	 *
	 *	@param	value	the ICFSecTenantObj instance to be referenced by the Tenant key.
	 */
	void setRequiredOwnerTenant( ICFSecTenantObj value );

	/**
	 *	Get the ICFSecTSecGroupObj instance referenced by the Group key.
	 *
	 *	@return	The ICFSecTSecGroupObj instance referenced by the Group key.
	 */
	ICFSecTSecGroupObj getRequiredContainerGroup();

	/**
	 *	Set the ICFSecTSecGroupObj instance referenced by the Group key.
	 *
	 *	@param	value	the ICFSecTSecGroupObj instance to be referenced by the Group key.
	 */
	void setRequiredContainerGroup( ICFSecTSecGroupObj value );

	/**
	 *	Get the ICFSecTSecGroupObj instance referenced by the SubGroup key.
	 *
	 *	@return	The ICFSecTSecGroupObj instance referenced by the SubGroup key.
	 */
	ICFSecTSecGroupObj getRequiredParentSubGroup();

	/**
	 *	Set the ICFSecTSecGroupObj instance referenced by the SubGroup key.
	 *
	 *	@param	value	the ICFSecTSecGroupObj instance to be referenced by the SubGroup key.
	 */
	void setRequiredParentSubGroup( ICFSecTSecGroupObj value );

	/**
	 *	Get the required CFLibDbKeyHash256 attribute TSecGrpIncId.
	 *
	 *	@return	The required CFLibDbKeyHash256 attribute TSecGrpIncId.
	 */
	CFLibDbKeyHash256 getRequiredTSecGrpIncId();

	/**
	 *	Set the required CFLibDbKeyHash256 attribute TSecGrpIncId.
	 *
	 *	@param value The required CFLibDbKeyHash256 attribute TSecGrpIncId value to be applied.
	 */
	void setRequiredTSecGrpIncId(CFLibDbKeyHash256 value);

	/**
	 *	Get the required CFLibDbKeyHash256 attribute TenantId.
	 *
	 *	@return	The required CFLibDbKeyHash256 attribute TenantId.
	 */
	CFLibDbKeyHash256 getRequiredTenantId();

	/**
	 *	Get the required CFLibDbKeyHash256 attribute TSecGroupId.
	 *
	 *	@return	The required CFLibDbKeyHash256 attribute TSecGroupId.
	 */
	CFLibDbKeyHash256 getRequiredTSecGroupId();

	/**
	 *	Get the required CFLibDbKeyHash256 attribute IncludeGroupId.
	 *
	 *	@return	The required CFLibDbKeyHash256 attribute IncludeGroupId.
	 */
	CFLibDbKeyHash256 getRequiredIncludeGroupId();

	public void copyRecToOrig();
	public void copyOrigToRec();

}
