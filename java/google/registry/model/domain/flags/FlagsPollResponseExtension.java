// Copyright 2016 The Domain Registry Authors. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package google.registry.model.domain.flags;

import google.registry.model.eppoutput.EppResponse.ResponseExtension;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * A flags extension that may be present on poll responses. See {@link
 * FlagsCreateResponseExtension} for more details about the flags extension. Poll messages can be
 * used for TLDs which require flags to support special functionality, to notify registrars about
 * changes in the status of domains.
 */
@XmlRootElement(name = "panData")
@XmlType(propOrder = {"add", "rem"})
public class FlagsPollResponseExtension implements ResponseExtension {
  FlagsList add;
  FlagsList rem;
}