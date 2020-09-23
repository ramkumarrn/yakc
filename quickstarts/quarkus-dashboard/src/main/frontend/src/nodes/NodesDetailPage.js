/*
 * Copyright 2020 Marc Nuri
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
 *
 */
import React from 'react';
import {connect} from 'react-redux';
import {Card} from 'tabler-react';
import DashboardPage from '../components/DashboardPage';
import metadata from '../metadata';
import pods from '../pods';

const NodesDetailPage = ({node}) => (
  <DashboardPage>
    <Card title={`Node - ${metadata.selectors.name(node)}`}>
      <Card.Body>
        <metadata.Details resource={node} />
      </Card.Body>
    </Card>
    <pods.List nodeName={metadata.selectors.name(node)}/>
  </DashboardPage>
);

const mapStateToProps = ({nodes}) => ({
  nodes
});

const mergeProps = (stateProps, dispatchProps, ownProps) => ({
  ...stateProps,
  ...dispatchProps,
  ...ownProps,
  node: Object.values(stateProps.nodes).find(node =>
    metadata.selectors.name(node) === ownProps.match.params.name)
});

export default connect(mapStateToProps, null, mergeProps)(NodesDetailPage);