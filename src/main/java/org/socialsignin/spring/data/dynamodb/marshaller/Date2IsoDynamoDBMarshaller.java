/**
 * Copyright © 2018 spring-data-dynamodb (https://github.com/boostchicken/spring-data-dynamodb)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.socialsignin.spring.data.dynamodb.marshaller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

public class Date2IsoDynamoDBMarshaller extends DateDynamoDBMarshaller {

	private static final String PATTERN = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
	private static final TimeZone UTC = TimeZone.getTimeZone("UTC");

	@Override
	public DateFormat getDateFormat() {
		SimpleDateFormat df = new SimpleDateFormat(PATTERN);
		df.setTimeZone(UTC);
		return df;
	}
}
