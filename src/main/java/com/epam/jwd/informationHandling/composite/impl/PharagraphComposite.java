package com.epam.jwd.informationHandling.composite.impl;

import com.epam.jwd.informationHandling.composite.TextComponentComposite;

import java.util.ArrayList;
import java.util.List;

public class PharagraphComposite implements TextComponentComposite
{
    private final List<TextComponentComposite> sentences = new ArrayList<>();

    @Override
    public void addTextComponent(TextComponentComposite textComponent)
    {
        this.sentences.add(textComponent);
    }

    @Override
    public void removeTextComponent(TextComponentComposite textComponent)
    {
        this.sentences.remove(textComponent);
    }
}