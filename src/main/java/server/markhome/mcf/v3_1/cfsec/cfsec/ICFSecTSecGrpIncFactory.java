
// Description: Java JPA Factory interface for TSecGrpInc.

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
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.text.StringEscapeUtils;
import server.markhome.mcf.v3_1.cflib.*;
import server.markhome.mcf.v3_1.cflib.dbutil.*;

/*
 *	ICFSecTSecGrpIncFactory interface for TSecGrpInc
 */
public interface ICFSecTSecGrpIncFactory
{

	/**
	 *	Allocate a primary history key for TSecGrpInc instances.
	 *
	 *	@return	The new instance.
	 */
	ICFSecTSecGrpIncHPKey newHPKey();

	/**
	 *	Allocate a TenantIdx key over TSecGrpInc instances.
	 *
	 *	@return	The new instance.
	 */
	public ICFSecTSecGrpIncByTenantIdxKey newByTenantIdxKey();

	/**
	 *	Allocate a GroupIdx key over TSecGrpInc instances.
	 *
	 *	@return	The new instance.
	 */
	public ICFSecTSecGrpIncByGroupIdxKey newByGroupIdxKey();

	/**
	 *	Allocate a IncludeIdx key over TSecGrpInc instances.
	 *
	 *	@return	The new instance.
	 */
	public ICFSecTSecGrpIncByIncludeIdxKey newByIncludeIdxKey();

	/**
	 *	Allocate a UIncludeIdx key over TSecGrpInc instances.
	 *
	 *	@return	The new instance.
	 */
	public ICFSecTSecGrpIncByUIncludeIdxKey newByUIncludeIdxKey();

	/**
	 *	Allocate a TSecGrpInc interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public ICFSecTSecGrpInc newRec();

	/**
	 *	Allocate a TSecGrpInc history interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public ICFSecTSecGrpIncH newHRec();

}
