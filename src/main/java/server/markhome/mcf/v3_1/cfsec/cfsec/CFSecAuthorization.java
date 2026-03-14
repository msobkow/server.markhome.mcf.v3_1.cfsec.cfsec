// Description: Java 25 CFSec Authorization Implementation

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

package server.markhome.mcf.v3_1.cfsec.cfsec;

import java.lang.reflect.*;
import java.io.*;
import java.net.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.text.StringEscapeUtils;
import server.markhome.mcf.v3_1.cflib.*;
import server.markhome.mcf.v3_1.cflib.dbutil.*;
import server.markhome.mcf.v3_1.cfsec.cfsecobj.ICFSecClusterObj;
import server.markhome.mcf.v3_1.cfsec.cfsecobj.ICFSecTenantObj;
import server.markhome.mcf.v3_1.cfsec.cfsecobj.ICFSecSecSessionObj;

/*
 *	A CFSecAuthorization is an authorization ticket
 *	for the system providing services.  Most modern authorizations
 *      are based on OAuth2 tickets, but I haven't gotten there yet...
 */
public class CFSecAuthorization implements ICFSecAuthorization, Serializable
{
	protected CFLibUuid6 authUuid6;
	protected String authUuid6Str;

	protected CFLibDbKeyHash256 secClusterId = CFLibDbKeyHash256.nullGet();
	protected CFLibDbKeyHash256 secTenantId = CFLibDbKeyHash256.nullGet();
	protected CFLibDbKeyHash256 secSessionId = CFLibDbKeyHash256.nullGet();
	protected CFLibDbKeyHash256 secUserId = CFLibDbKeyHash256.nullGet();

	public CFSecAuthorization() {
		authUuid6 = CFLibUuid6.generateUuid6();
		authUuid6Str = authUuid6.toString();
	}

	public CFLibUuid6 getAuthUuid6() {
		return( authUuid6 );
	}

	public void setAuthUuid6( CFLibUuid6 value ) {
		authUuid6 = value;
		authUuid6Str = authUuid6.toString();
	}

	public String getAuthUuid6Str() {
		return( authUuid6Str );
	}

	public CFLibDbKeyHash256 getSecClusterId() {
		return( secClusterId );
	}

	public void setSecClusterId( CFLibDbKeyHash256 clusterId ) {
		secClusterId = clusterId;
	}

	public void setSecCluster( ICFSecClusterObj value ) {
		// The cluster id is never cleared to 0 after it's been set
		if( value != null ) {
			secClusterId = value.getRequiredId();
		}
	}

	public CFLibDbKeyHash256 getSecTenantId() {
		return( secTenantId );
	}

	public void setSecTenantId( CFLibDbKeyHash256 tenantId ) {
		secTenantId = tenantId;
	}

	public void setSecTenant( ICFSecTenantObj value ) {
		// The tenant id is never cleared to 0 after it's been set
		if( value != null ) {
			secTenantId = value.getRequiredId();
		}
	}

	public CFLibDbKeyHash256 getSecSessionId() {
		return( secSessionId );
	}

	public void setSecSessionId( CFLibDbKeyHash256 sessionId ) {
		secSessionId = sessionId;
	}

	public void setSecSession( ICFSecSecSessionObj value )
	{
		// The session and user id are never cleared after they've been set
		if( value != null ) {
			secSessionId = value.getRequiredSecSessionId();
			secUserId = value.getRequiredSecUserId();
		}
	}

	public CFLibDbKeyHash256 getSecUserId() {
		return( secUserId );
	}

	public void setSecUserId( CFLibDbKeyHash256 userId ) {
		secUserId = userId;
	}
}
