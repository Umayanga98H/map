package com.hiumayanga.map

import androidx.fragment.app.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapsFragment : Fragment() {

    private val callback = OnMapReadyCallback { googleMap ->
        /**
         * Manipulates the map once available.
         * This callback is triggered when the map is ready to be used.
         * This is where we can add markers or lines, add listeners or move the camera.
         * In this case, we just add a marker near Sydney, Australia.
         * If Google Play services is not installed on the device, the user will be prompted to
         * install it inside the SupportMapFragment. This method will only be triggered once the
         * user has installed Google Play services and returned to the app.
         */
        val kelaniya = LatLng(6.9744, 79.9161)
        val jayawardanapura = LatLng(6.8528, 79.9036)
        val peradeniya = LatLng(7.2549, 80.5974)
        val colombo = LatLng(6.9000, 79.8588)
        val ruhuna = LatLng(5.9381, 80.5761)
        val jaffna = LatLng(9.6849, 80.0220)
        val eastern = LatLng(7.7944, 81.5790)
        val rajarata = LatLng(8.3620, 80.5048)
        val sabaragamuwa = LatLng(6.7146, 80.7872)


        googleMap.setMinZoomPreference(8.0f)
        googleMap.addMarker(MarkerOptions().position(kelaniya).title("University of Kelaniya"))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(kelaniya))

        googleMap.addMarker(MarkerOptions().position(jayawardanapura).title("University of Jayawardanapura"))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(jayawardanapura))

        googleMap.addMarker(MarkerOptions().position(peradeniya).title("University of Peradeniya"))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(peradeniya))

        googleMap.addMarker(MarkerOptions().position(colombo).title("University of Colombo"))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(colombo))

        googleMap.addMarker(MarkerOptions().position(ruhuna).title("University of Ruhuna"))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(ruhuna))

        googleMap.addMarker(MarkerOptions().position(jaffna).title("University of Jaffna"))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(jaffna))

        googleMap.addMarker(MarkerOptions().position(eastern).title("University of Eastern"))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(eastern))

        googleMap.addMarker(MarkerOptions().position(rajarata).title("University of Rajarata"))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(rajarata))

        googleMap.addMarker(MarkerOptions().position(sabaragamuwa).title("University of Sabaragamuwa"))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(jaffna))
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_maps, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val mapFragment = childFragmentManager.findFragmentById(R.id.map) as SupportMapFragment?
        mapFragment?.getMapAsync(callback)
    }
}