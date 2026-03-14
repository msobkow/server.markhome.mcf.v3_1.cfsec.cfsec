// Description: Java 25 interface for a SecGrpMemb record implementation

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

import java.io.Serializable;
import java.math.*;
import java.time.*;
import java.util.*;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.text.StringEscapeUtils;
import server.markhome.mcf.v3_1.cflib.*;
import server.markhome.mcf.v3_1.cflib.dbutil.*;
import server.markhome.mcf.v3_1.cflib.xml.CFLibXmlUtil;
//import server.markhome.mcf.v3_1.cfsec.cfsec.*;

public interface ICFSecSecGrpMemb
{
        public static final String S_INIT_CREATED_BY = "0000000000000000000000000000000000000000000000000000000000000000";
        public static final CFLibDbKeyHash256 INIT_CREATED_BY = CFLibDbKeyHash256.fromHex(S_INIT_CREATED_BY);
        public static final String S_INIT_UPDATED_BY = "0000000000000000000000000000000000000000000000000000000000000000";
        public static final CFLibDbKeyHash256 INIT_UPDATED_BY = CFLibDbKeyHash256.fromHex(S_INIT_UPDATED_BY);
	public static final String S_SECGRPMEMBID_INIT_VALUE = "$switch HasInitValue yes InitValue default Zero256bits$";
	public static final CFLibDbKeyHash256 SECGRPMEMBID_INIT_VALUE = CFLibDbKeyHash256.fromHex( S_SECGRPMEMBID_INIT_VALUE );
	public static final String S_CLUSTERID_INIT_VALUE = "$switch HasInitValue yes InitValue default Zero256bits$";
	public static final CFLibDbKeyHash256 CLUSTERID_INIT_VALUE = CFLibDbKeyHash256.fromHex( S_CLUSTERID_INIT_VALUE );
	public static final String S_SECGROUPID_INIT_VALUE = "$switch HasInitValue yes InitValue default Zero256bits$";
	public static final CFLibDbKeyHash256 SECGROUPID_INIT_VALUE = CFLibDbKeyHash256.fromHex( S_SECGROUPID_INIT_VALUE );
	public static final String S_SECUSERID_INIT_VALUE = "$switch HasInitValue yes InitValue default Zero256bits$";
	public static final CFLibDbKeyHash256 SECUSERID_INIT_VALUE = CFLibDbKeyHash256.fromHex( S_SECUSERID_INIT_VALUE );
	public final static int CLASS_CODE = 0xa00f;
	public final static String S_CLASS_CODE = "a00f";

	public int getClassCode();

	public CFLibDbKeyHash256 getCreatedByUserId();
	public void setCreatedByUserId( CFLibDbKeyHash256 value );
	public LocalDateTime getCreatedAt();
	public void setCreatedAt( LocalDateTime value );
	public CFLibDbKeyHash256 getUpdatedByUserId();
	public void setUpdatedByUserId( CFLibDbKeyHash256 value );
	public LocalDateTime getUpdatedAt();
	public void setUpdatedAt( LocalDateTime value );

	public CFLibDbKeyHash256 getPKey();
	public void setPKey(CFLibDbKeyHash256 requiredSecGrpMembId);
	
	public CFLibDbKeyHash256 getRequiredSecGrpMembId();
	public void setRequiredSecGrpMembId( CFLibDbKeyHash256 value );
	public int getRequiredRevision();
	public void setRequiredRevision( int value );

	public ICFSecCluster getRequiredOwnerCluster();
	public ICFSecSecGroup getRequiredContainerGroup();
	public ICFSecSecUser getRequiredParentUser();
	public void setRequiredOwnerCluster(ICFSecCluster argObj);
	public void setRequiredOwnerCluster(CFLibDbKeyHash256 argClusterId);
	public void setRequiredContainerGroup(ICFSecSecGroup argObj);
	public void setRequiredContainerGroup(CFLibDbKeyHash256 argSecGroupId);
	public void setRequiredParentUser(ICFSecSecUser argObj);
	public void setRequiredParentUser(CFLibDbKeyHash256 argSecUserId);
	public CFLibDbKeyHash256 getRequiredClusterId();
	public CFLibDbKeyHash256 getRequiredSecGroupId();
	public CFLibDbKeyHash256 getRequiredSecUserId();
	@Override
	public boolean equals( Object obj );
	
	@Override
	public int hashCode();

	//@Override not necessary because interfaces aren't able to implement Comparable, but they can double-team on the requirement
	public int compareTo( Object obj );

	public void set( ICFSecSecGrpMemb src );
	public void setSecGrpMemb( ICFSecSecGrpMemb src );
	public void set( ICFSecSecGrpMembH src );
	public void setSecGrpMemb( ICFSecSecGrpMembH src );

	public String getXmlAttrFragment();

	@Override
	public String toString();
}
