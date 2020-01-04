package br.com.buscabus.www.buscabus_meuonibus;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.os.Bundle;
import android.widget.Toolbar;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.tasks.Task;

public class Act_Mapa extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act__mapa);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Adiciona um marcador
        // TICEN
        LatLng ticen = new LatLng(-27.598468, -48.553961);
        mMap.addMarker(new MarkerOptions().position(ticen).title("TICEN").snippet("Terminal de Integração do Centro")
                .icon(bitmapDescriptorFromVector(getApplicationContext(),R.drawable.ic_directions_bus_black_24dp)));
        // TITRI
        LatLng titri = new LatLng(-27.583873, -48.522908);
        mMap.addMarker(new MarkerOptions().position(titri).title("TITRI").snippet("Terminal de Integração da Trindade")
                .icon(bitmapDescriptorFromVector(getApplicationContext(),R.drawable.ic_directions_bus_black_24dp)));
        // TIRIO
        LatLng tirio = new LatLng(-27.665944, -48.503623);
        mMap.addMarker(new MarkerOptions().position(tirio).title("TIRIO").snippet("Terminal de Integração do Rio Tavares")
                .icon(bitmapDescriptorFromVector(getApplicationContext(),R.drawable.ic_directions_bus_black_24dp)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(tirio));
        // TILAG
        LatLng tilag = new LatLng(-27.602739, -48.470790);
        mMap.addMarker(new MarkerOptions().position(tilag).title("TILAG").snippet("Terminal de Integração da Lagoa")
                .icon(bitmapDescriptorFromVector(getApplicationContext(),R.drawable.ic_directions_bus_black_24dp)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(tilag));
        // TISAN
        LatLng tisan = new LatLng(-27.501491, -48.515154);
        mMap.addMarker(new MarkerOptions().position(tisan).title("TISAN").snippet("Terminal de Integração de Santo Antônio")
                .icon(bitmapDescriptorFromVector(getApplicationContext(),R.drawable.ic_directions_bus_black_24dp)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(tisan));
        // TICAN
        LatLng tican = new LatLng(-27.452043, -48.455961);
        mMap.addMarker(new MarkerOptions().position(tican).title("TICAN").snippet("Terminal de Integração de Canasvieiras")
                .icon(bitmapDescriptorFromVector(getApplicationContext(),R.drawable.ic_directions_bus_black_24dp)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(tican));
        // TCFL
        LatLng tcfl = new LatLng(-27.599307, -48.550002);
        mMap.addMarker(new MarkerOptions().position(tcfl).title("TCIF").snippet("Terminal Cidade de Florianópolis")
                .icon(bitmapDescriptorFromVector(getApplicationContext(),R.drawable.ic_directions_bus_black_24dp)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(tcfl));
        // ESTAÇÃO PALHOÇA
        LatLng estPH = new LatLng(-27.629441, -48.654991);
        mMap.addMarker(new MarkerOptions().position(estPH).title("Estação Palhoça")
                .icon(bitmapDescriptorFromVector(getApplicationContext(),R.drawable.ic_directions_bus_black_24dp)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(estPH));


        // Adiciona Zoom no Mapa
        CameraPosition cameraPosition = new CameraPosition.Builder().target(
                new LatLng(-27.598468, -48.553961)).zoom(11).build();

        googleMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));

        // Adiciona a localização atual
        //googleMap.setMyLocationEnabled(true);


        // Adciona botoões de Zoom
        googleMap.getUiSettings().setZoomControlsEnabled(true);

    }

    // Comando para personalizar o icone
    private BitmapDescriptor bitmapDescriptorFromVector (Context context, int vectorResId){
        Drawable vectorDrawable = ContextCompat.getDrawable(context,vectorResId);
        vectorDrawable.setBounds(0, 0, vectorDrawable.getIntrinsicWidth(), vectorDrawable.getIntrinsicHeight());
        Bitmap bitmap = Bitmap.createBitmap(vectorDrawable.getIntrinsicWidth(), vectorDrawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        vectorDrawable.draw(canvas);
        return BitmapDescriptorFactory.fromBitmap(bitmap);

    }

}
