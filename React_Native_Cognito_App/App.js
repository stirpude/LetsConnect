//import React from 'react';
import React, { Component } from 'react';
import { StyleSheet, Text, View, Image } from 'react-native';
import MapView, { PROVIDER_GOOGLE, Marker, Callout, Circle, Polygon } from 'react-native-maps';
import { Alert } from 'react-native';
import Amplify from '@aws-amplify/core'
import awsConfig from './aws-exports';
import amplify from './aws-exports';

Amplify.configure(awsConfig);

import { withAuthenticator } from 'aws-amplify-react-native';


  export class App extends React.Component  {
  state = {

    coordinates: [

      { name: 'Prajwal', latitude: 41.877800, longitude: -87.624326 },
      { name: 'Shruti', latitude: 41.938079, longitude: -87.641654 },
      { name: 'Tasmay', latitude: 41.890919, longitude: -87.717240 },

    ]
  }



  showwelcomeMessage = () => {

    Alert.alert('Welcome to Chicago',
      'Its a Windy City',
      [
        {
          text: 'Cancel',
          style: 'cancel'
        },
        {
          text: 'OK'

        }
      ]
    )

  }



  render() {
    return (
      <MapView
        provider={PROVIDER_GOOGLE}
        style={{ flex: 1 }}
        region={{
          latitude: 42.882004,
          longitude: 74.582748,
          latitudeDelta: 0.0922,
          longitudeDelta: 0.0421
        }}  >


        <Polygon
          coordinates={this.state.coordinates}
        />

        <Circle

          center={{ latitude: 41.877800, longitude: -87.624326 }}
          radius={1000}
          fillColor={'rgba(200,300,300,0.5)'}

        />


        <Marker
          coordinate={{ latitude: 41.877800, longitude: -87.624326 }}
          title={'Chicago'}>




        </Marker>

        {

          this.state.coordinates.map(marker => (
            <Marker
              key={marker.name}
              coordinate={{ latitude: marker.latitude, longitude: marker.longitude }}
              title={marker.name}
            >
              <Callout>
                

                <Text>{marker.name}</Text>

              </Callout>
              <Image
                style={{ width: 50, height: 50 }}
                source={require('./src/img/dexter.png')} />

            </Marker>
          ))
        }


      </MapView>);
  }
}

export default withAuthenticator(App);

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
});
