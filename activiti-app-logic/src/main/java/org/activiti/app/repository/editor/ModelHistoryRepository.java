/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.activiti.app.repository.editor;

import org.activiti.app.domain.editor.ModelHistory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Spring Data JPA repository for the ModelHistory entity.
 */
public interface ModelHistoryRepository extends JpaRepository<ModelHistory, String> {

    List<ModelHistory> findByCreatedByAndModelTypeAndRemovalDateIsNull(String createdBy, Integer modelType);

    List<ModelHistory> findByModelIdAndRemovalDateIsNullOrderByVersionDesc(String modelId);

    List<ModelHistory> findByModelIdOrderByVersionDesc(Long modelId);


}