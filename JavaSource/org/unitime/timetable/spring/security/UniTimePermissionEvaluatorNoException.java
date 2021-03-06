/*
 * Licensed to The Apereo Foundation under one or more contributor license
 * agreements. See the NOTICE file distributed with this work for
 * additional information regarding copyright ownership.
 *
 * The Apereo Foundation licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */
package org.unitime.timetable.spring.security;

import java.io.Serializable;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

/**
 * @author Tomas Muller
 */
@Service("unitimePermissionEvaluatorNoException")
public class UniTimePermissionEvaluatorNoException extends UniTimePermissionEvaluator {
	
	@Override
	public boolean hasPermission(Authentication authentication, Object domainObject, Object permission) {
		try {
			return super.hasPermission(authentication, domainObject, permission);
		} catch (Exception e) {
			return false;
		}
	}
	
	@Override
	public boolean hasPermission(Authentication authentication, Serializable targetId, String targetType, Object permission) {
		try {
			return super.hasPermission(authentication, targetId, targetType, permission);
		} catch (Exception e) {
			return false;
		}
	}

}
