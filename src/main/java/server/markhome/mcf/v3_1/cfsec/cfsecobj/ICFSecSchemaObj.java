// Description: Java 25 Schema Object interface for CFSec.

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
import server.markhome.mcf.v3_1.cfsec.cfsec.*;

public interface ICFSecSchemaObj
{
	ICFSecAuthorization getAuthorization();
	void setAuthorization( ICFSecAuthorization value );

	String getSchemaName();

	void setSecClusterName( String value );
	ICFSecClusterObj getSecCluster();
	void setSecCluster( ICFSecClusterObj value );

	void setSecTenantName( String value );
	ICFSecTenantObj getSecTenant();
	void setSecTenant( ICFSecTenantObj value );

	void setSecUserName( String value );
	ICFSecSecUserObj getSecUser();
	void setSecUser( ICFSecSecUserObj value );

	void setSecSessionId( CFLibDbKeyHash256 value );
	ICFSecSecSessionObj getSecSession();
	void setSecSession( ICFSecSecSessionObj value );

	void logout();

	void minimizeMemory();

	public ICFSecSchema getCFSecBackingStore();
	public void setCFSecBackingStore(ICFSecSchema cfsecBackingStore);

	/**
	 *	Get the Cluster interface for the schema.
	 *
	 *	@return	The ICFSecClusterTableObj interface implementation for the schema.
	 */
	ICFSecClusterTableObj getClusterTableObj();

	/**
	 *	Get the HostNode interface for the schema.
	 *
	 *	@return	The ICFSecHostNodeTableObj interface implementation for the schema.
	 */
	ICFSecHostNodeTableObj getHostNodeTableObj();

	/**
	 *	Get the ISOCcy interface for the schema.
	 *
	 *	@return	The ICFSecISOCcyTableObj interface implementation for the schema.
	 */
	ICFSecISOCcyTableObj getISOCcyTableObj();

	/**
	 *	Get the ISOCtry interface for the schema.
	 *
	 *	@return	The ICFSecISOCtryTableObj interface implementation for the schema.
	 */
	ICFSecISOCtryTableObj getISOCtryTableObj();

	/**
	 *	Get the ISOCtryCcy interface for the schema.
	 *
	 *	@return	The ICFSecISOCtryCcyTableObj interface implementation for the schema.
	 */
	ICFSecISOCtryCcyTableObj getISOCtryCcyTableObj();

	/**
	 *	Get the ISOCtryLang interface for the schema.
	 *
	 *	@return	The ICFSecISOCtryLangTableObj interface implementation for the schema.
	 */
	ICFSecISOCtryLangTableObj getISOCtryLangTableObj();

	/**
	 *	Get the ISOLang interface for the schema.
	 *
	 *	@return	The ICFSecISOLangTableObj interface implementation for the schema.
	 */
	ICFSecISOLangTableObj getISOLangTableObj();

	/**
	 *	Get the ISOTZone interface for the schema.
	 *
	 *	@return	The ICFSecISOTZoneTableObj interface implementation for the schema.
	 */
	ICFSecISOTZoneTableObj getISOTZoneTableObj();

	/**
	 *	Get the SecDevice interface for the schema.
	 *
	 *	@return	The ICFSecSecDeviceTableObj interface implementation for the schema.
	 */
	ICFSecSecDeviceTableObj getSecDeviceTableObj();

	/**
	 *	Get the SecGroup interface for the schema.
	 *
	 *	@return	The ICFSecSecGroupTableObj interface implementation for the schema.
	 */
	ICFSecSecGroupTableObj getSecGroupTableObj();

	/**
	 *	Get the SecGrpInc interface for the schema.
	 *
	 *	@return	The ICFSecSecGrpIncTableObj interface implementation for the schema.
	 */
	ICFSecSecGrpIncTableObj getSecGrpIncTableObj();

	/**
	 *	Get the SecGrpMemb interface for the schema.
	 *
	 *	@return	The ICFSecSecGrpMembTableObj interface implementation for the schema.
	 */
	ICFSecSecGrpMembTableObj getSecGrpMembTableObj();

	/**
	 *	Get the SecSession interface for the schema.
	 *
	 *	@return	The ICFSecSecSessionTableObj interface implementation for the schema.
	 */
	ICFSecSecSessionTableObj getSecSessionTableObj();

	/**
	 *	Get the SecUser interface for the schema.
	 *
	 *	@return	The ICFSecSecUserTableObj interface implementation for the schema.
	 */
	ICFSecSecUserTableObj getSecUserTableObj();

	/**
	 *	Get the Service interface for the schema.
	 *
	 *	@return	The ICFSecServiceTableObj interface implementation for the schema.
	 */
	ICFSecServiceTableObj getServiceTableObj();

	/**
	 *	Get the ServiceType interface for the schema.
	 *
	 *	@return	The ICFSecServiceTypeTableObj interface implementation for the schema.
	 */
	ICFSecServiceTypeTableObj getServiceTypeTableObj();

	/**
	 *	Get the SysCluster interface for the schema.
	 *
	 *	@return	The ICFSecSysClusterTableObj interface implementation for the schema.
	 */
	ICFSecSysClusterTableObj getSysClusterTableObj();

	/**
	 *	Get the TSecGroup interface for the schema.
	 *
	 *	@return	The ICFSecTSecGroupTableObj interface implementation for the schema.
	 */
	ICFSecTSecGroupTableObj getTSecGroupTableObj();

	/**
	 *	Get the TSecGrpInc interface for the schema.
	 *
	 *	@return	The ICFSecTSecGrpIncTableObj interface implementation for the schema.
	 */
	ICFSecTSecGrpIncTableObj getTSecGrpIncTableObj();

	/**
	 *	Get the TSecGrpMemb interface for the schema.
	 *
	 *	@return	The ICFSecTSecGrpMembTableObj interface implementation for the schema.
	 */
	ICFSecTSecGrpMembTableObj getTSecGrpMembTableObj();

	/**
	 *	Get the Tenant interface for the schema.
	 *
	 *	@return	The ICFSecTenantTableObj interface implementation for the schema.
	 */
	ICFSecTenantTableObj getTenantTableObj();
}
