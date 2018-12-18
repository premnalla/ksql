/**
 * Copyright 2017 Confluent Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 **/

package io.confluent.ksql.parser.tree;

import com.google.common.base.MoreObjects;
import java.util.Objects;
import java.util.Optional;

public class ExportCatalog extends Statement {

  final String catalogFilePath;

  public ExportCatalog(final Optional<NodeLocation> location, final String catalogFilePath) {
    super(location);
    if (catalogFilePath.startsWith("'") && catalogFilePath.endsWith("'")) {
      this.catalogFilePath = catalogFilePath.substring(1, catalogFilePath.length() - 1);
    } else {
      this.catalogFilePath = catalogFilePath;
    }

  }

  public String getCatalogFilePath() {
    return catalogFilePath;
  }

  @Override
  public int hashCode() {
    return Objects.hash("ListStreams");
  }

  @Override
  public boolean equals(final Object obj) {
    return this == obj;
  }

  @Override
  public String toString() {
    return MoreObjects.toStringHelper(this)
        .toString();
  }
}
