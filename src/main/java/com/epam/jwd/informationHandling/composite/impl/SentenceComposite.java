package com.epam.jwd.informationHandling.composite.impl;

import com.epam.jwd.informationHandling.composite.TextComponentComposite;

import java.util.ArrayList;
import java.util.List;

public class SentenceComposite implements TextComponentComposite
{
    private final List<TextComponentComposite> lexemmes = new ArrayList<>();

    @Override
    public void addTextComponent(TextComponentComposite textComponent)
    {
        this.lexemmes.add(textComponent);
    }

    @Override
    public void removeTextComponent(TextComponentComposite textComponent)
    {
        this.lexemmes.remove(textComponent);
    }
}
