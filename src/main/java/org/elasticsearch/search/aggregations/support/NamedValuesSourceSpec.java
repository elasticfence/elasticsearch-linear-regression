/*
 * Copyright (c) 2017 Scaleborn UG, www.scaleborn.com
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

package org.elasticsearch.search.aggregations.support;

/**
 * Created by mbok on 03.04.17.
 */
public class NamedValuesSourceSpec<VS extends ValuesSource> {

  private String name;
  private VS valuesSource;

  public NamedValuesSourceSpec(final String name, final VS valuesSource) {
    this.name = name;
    this.valuesSource = valuesSource;
  }

  public String getName() {
    return name;
  }

  public VS getValuesSource() {
    return valuesSource;
  }
}
