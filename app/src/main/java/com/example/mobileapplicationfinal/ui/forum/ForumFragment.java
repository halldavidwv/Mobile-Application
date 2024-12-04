package com.example.mobileapplicationfinal.ui.forum;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.mobileapplicationfinal.databinding.FragmentForumBinding;

public class ForumFragment extends Fragment {

    private FragmentForumBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        com.example.mobileapplicationfinal.ui.forum.ForumViewModel forumViewModel =
                new ViewModelProvider(this).get(com.example.mobileapplicationfinal.ui.forum.ForumViewModel.class);

        binding = FragmentForumBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.forumNameTextView;
        forumViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}